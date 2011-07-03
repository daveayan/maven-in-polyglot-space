package com.quicksolutions.sample.plugin

import org.codehaus.groovy.maven.mojo.GroovyMojo 

/**
 * Says "Hi" to the user... er well not really :-P.
 * @goal sayhi
 */
class GroovyPluginMojo extends GroovyMojo {
	void execute() {
        log.info('Its Groovy Time')
    }
}