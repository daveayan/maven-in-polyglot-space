package com.quicksolutions.maven.plugin

import org.apache.maven.plugin._
import java.io.File

/**
 * Goal which echos "HAI"
 * @goal sayhi
 * @phase process-sources
 */
class TestScalaMojo extends AbstractMojo {
  /**
   * Location of the file.
   * @parameter expression="${project.build.directory}"
   * @required
   */
  var outputDirectory : File = _;
  
  @throws(classOf[MojoExecutionException])
  override def execute() {
    getLog.error("HAI")
    getLog.error("outputDirectory = " + outputDirectory);//.getAbsolutePath);
  }
}