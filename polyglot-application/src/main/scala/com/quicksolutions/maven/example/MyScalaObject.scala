package com.quicksolutions.maven.example
{
	object MyScalaObject extends Application {
		def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
		for (i <- 1 to 100 if isPrime(i)) println(i)
		
		val someJavaClass = new SomeJavaClass()
		someJavaClass.someJavaMethodToBeCalled()
		
		val someGroovyClass = new MyGroovyObject()
		someGroovyClass.someGroovyMethodToBeCalled()
	}
}