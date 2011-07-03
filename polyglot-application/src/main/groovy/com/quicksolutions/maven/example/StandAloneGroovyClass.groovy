package com.quicksolutions.maven.example

import com.quicksolutions.maven.example.MyGroovyObject
//import com.quicksolutions.maven.example.MyScalaObject

class StandAloneGroovyClass {
	static main(args) {
		println "Hello from StandAloneGroovyClass"
		def groovyObject = new MyGroovyObject()
		// def scalaObject = new MyScalaObject()
		
		println groovyObject.getLuckyNumberOfTheDay()
		// println scalaObject.isPrime(7)
	}
}