# Eclipse Extras [![Build Status](https://travis-ci.org/rherrmann/eclipse-extras.png)](https://travis-ci.org/rherrmann/eclipse-extras)

Small extensions for the Eclipse IDE

## Current Features

### JUnit Status Bar
A small contribution to the status bar shows the status of the current or most recent JUnit run. The progress bar is colored green or red depending on how the test results are. The button to the left of the bar opens the JUnit view. Use the _Java &gt; JUnit &gt; JUnit Status Bar_ preference page to show or hide the JUnit Status Bar.

![](https://raw.githubusercontent.com/rherrmann/eclipse-extras/master/readme-images/junit-status-bar.png)

### Key Binding for the JUnit View
The key sequence <kbd>Alt+Shift+Q U</kbd> is assigned to open the JUnit view in the current perspective.

![](https://raw.githubusercontent.com/rherrmann/eclipse-extras/master/readme-images/show-junit-view.png)

### Key Binding for the Open With... Menu
The key sequence <kbd>Shift+F3</kbd> can be used to show the _Open With_ menu for the selected file. The menu provides a list of alternative editors to open the file in.

![](https://raw.githubusercontent.com/rherrmann/eclipse-extras/master/readme-images/open-with-menu.png)

### Key Binding to Delete File of Active Editor
If the currently active editor shows a file from the workspace, the key sequence <kbd>Alt+Del</kbd> can be used to delete this file and close the corresponding editor. The command invokes the regular delete operation so that the behavior is the same as if the edited file was deleted from one of the navigation views.

![](https://raw.githubusercontent.com/rherrmann/eclipse-extras/master/readme-images/delete-editor-resource.png)

### Key Binding to Close the Active View
The key binding <kbd>Ctrl+Shift+Q</kbd> closes the currently active view. Just like <kbd>Ctrl+W</kbd> closes the active editor, there is now also a key binding to close the active view. 

### Launch Configuration Selection Dialog
Much like the _Open Type_ or _Open Resource_ dialog, the <kbd>Alt+F11</kbd> key binding opens a dialog that lists all launch configurations. The selected launch configuration(s) can be started or edited prior to starting. The launch mode (debug, run, profile, etc) to be used can be changed through the Default Launch Mode drop menu menu.

![](https://raw.githubusercontent.com/rherrmann/eclipse-extras/master/readme-images/launch-config-dialog.png)

### Extended Export/Import Preferences Wizards
Eclipse Extras provides extensions to the Export/Import wizards to transfer general workbench preferences. This allows to transfer settings for:
* General Editor
* Text Editor
* Workbench Appearance
* Workspace
* Search
* Run/Debug

![](https://raw.githubusercontent.com/rherrmann/eclipse-extras/master/readme-images/export-preferences-wizard.png)


## Installation
You can install Eclipse Extras directly from this software site: http://rherrmann.github.io/eclipse-extras/repository/

In the Eclipse main menu, click _Help > Install New Software…_. Then enter the URL above and select Eclipse Extras

## Requirements
Works with all Eclipse versions back to 3.8 (Juno) and Java 1.6 or later.

## Contributing
Please see the [contributing guidelines](CONTRIBUTING.md).

## License
The code is published under the terms of the [Eclipse Public License, version 1.0](https://www.eclipse.org/legal/epl-v10.html).