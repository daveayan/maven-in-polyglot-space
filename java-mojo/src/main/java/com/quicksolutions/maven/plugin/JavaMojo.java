package com.quicksolutions.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;

/**
 * @goal sayhi
 */
public class JavaMojo extends AbstractMojo {
    /**
     * The Maven Project Object
     * @parameter expression="${project}"
     * @required
     * @readonly
     */
    protected MavenProject project;
	public void execute() throws MojoExecutionException {
		getLog().info("Hello From JavaMojo");
		getLog().info("=================================");
		getLog().info(project.getGroupId() + ":" + project.getArtifactId());
		getLog().info("=================================");
	}
}
