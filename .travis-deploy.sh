#!/bin/bash

function error_exit
{
  echo -e "\e[01;31m$1\e[00m" 1>&2
  exit 1
}

if [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then
  echo -e "Starting to deploy to gh-pages...\n"

  # create and cd into temporary deployment work directory
  mkdir deployment-work
  cd deployment-work

  # setup git and clone from gh-pages branch
  git config --global user.email "travis-deployer@codeaffine.com"
  git config --global user.name "Travis Deployer for Extras for Eclipse"
  git clone --quiet --branch=gh-pages git@github.com:${TRAVIS_REPO_SLUG}.git . > /dev/null 2>&1 || error_exit "Error cloning gh-pages"

  # clean the repository directory, then copy the build result into it
  git rm -rf repository
  mkdir -p repository 
  cp -rf ../com.codeaffine.extras.repository/target/repository/* ./repository
  
  # add, commit and push files
  git add -f repository
  git commit -m "[ci skip] Deploy Travis build #${TRAVIS_BUILD_NUMBER} to gh-pages"
  git push -fq origin gh-pages > /dev/null 2>&1 || error_exit "Error uploading the build result to gh-pages"

  # go back to the directory where we started
  cd ..
  rm -rf deployment-work
  rm deploy-key
  
  echo -e "Done with deployment to gh-pages\n"
fi
