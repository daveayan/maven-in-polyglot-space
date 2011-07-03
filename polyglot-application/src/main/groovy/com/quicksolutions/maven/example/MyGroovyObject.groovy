package com.quicksolutions.maven.example

import java.util.Random
/*import com.quicksolutions.maven.example.MyScalaObject*/

class MyGroovyObject {
	def random = new Random()
	int getLuckyNumberOfTheDay() {
		
		/*MyScalaObject scalaObject = new MyScalaObject();
				scalaObject.isPrime(7);*/
		
		return random.nextInt(100) 
	}
	
	void someGroovyMethodToBeCalled() {
		println "In someGroovyMethodToBeCalled"
	}
}