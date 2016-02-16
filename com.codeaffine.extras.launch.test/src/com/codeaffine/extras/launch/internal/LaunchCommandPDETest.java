package com.codeaffine.extras.launch.internal;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.core.commands.IHandler;
import org.junit.Test;

import com.codeaffine.eclipse.core.runtime.Extension;
import com.codeaffine.eclipse.core.runtime.Predicates;
import com.codeaffine.eclipse.core.runtime.RegistryAdapter;
import com.codeaffine.extras.launch.internal.dialog.OpenLaunchDialogHander;


public class LaunchCommandPDETest {

  @Test
  public void testExtension() {
    Extension extension = readCommandExtension();

    assertThat( extension.getAttribute( "name" ) ).isNotEmpty();
    assertThat( extension.getAttribute( "description" ) ).isNotEmpty();
    assertThat( extension.getAttribute( "categoryId" ) ).isEqualTo( "org.eclipse.debug.ui.category.run" );
    IHandler handler = extension.createExecutableExtension( "defaultHandler", IHandler.class );
    assertThat( handler ).isInstanceOf( OpenLaunchDialogHander.class );
  }

  private static Extension readCommandExtension() {
    return new RegistryAdapter()
      .readExtension( "org.eclipse.ui.commands" )
      .thatMatches( Predicates.attribute( "id", OpenLaunchDialogHander.COMMAND_ID ) )
      .process();
  }

}
