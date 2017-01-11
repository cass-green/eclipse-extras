package com.codeaffine.extras.workingset.internal;

import static com.codeaffine.extras.workingset.internal.Images.WORKING_SET_WIZBAN;
import static com.codeaffine.extras.workingset.internal.Images.getImageDescriptor;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class DynamicWorkingSetWizard extends Wizard implements INewWizard {

  public static final String ID = "com.codeaffine.extras.ide.internal.DynamicWorkingSetWizard";

  private IWorkbench workbench;
  private DynamicWorkingSetPage page;

  public DynamicWorkingSetWizard() {
    setDefaultPageImageDescriptor( getImageDescriptor( WORKING_SET_WIZBAN ) );
    setDialogSettings( WorkingSetExtrasPlugin.getInstance().getDialogSettings() );
    setWindowTitle( "New Dynamic Project Working Set" );
  }

  @Override
  public void init( IWorkbench workbench, IStructuredSelection selection ) {
    this.workbench = workbench;
  }

  @Override
  public void addPages() {
    page = new DynamicWorkingSetPage();
    addPage( page );
  }

  @Override
  public boolean performFinish() {
    page.finish();
    workbench.getWorkingSetManager().addWorkingSet( page.getSelection() );
    return true;
  }

}
