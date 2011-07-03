package com.quicksolutions.sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Says "Hi" to the user.
 * @goal sayhi
 */
public class JavaPluginMojo extends AbstractMojo {
	public void execute() throws MojoExecutionException
    {
        getLog().info("Hello, world.");
    }
}