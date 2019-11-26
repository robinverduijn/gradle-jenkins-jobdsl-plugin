package hudson

import java.util.logging.Logger

import org.jvnet.hudson.test.TestPluginManager

public class CustomPluginManager extends TestPluginManager {
  private static final Logger LOGGER = Logger.getLogger( CustomPluginManager.class.getName() )

  // Skip loading all detached plugins as they conflict with our explicit build.gradle jenkinsPlugins dependencies
  @Override
  void considerDetachedPlugin( String shortName ) {
    LOGGER.info( "Skipping load of detached plugin: " + shortName )
  }
}
