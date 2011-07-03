******************************************************
INTRODUCTION TO MAVEN:								 *
******************************************************
- COMMANDS
-- cd development/installs/symlinks
-- rm maven
-- ln -s ../apa* maven
- build lifecycle, dependency management, pom.xml, groupid, artifactid, version
- Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.
- A maven (also mavin) is a trusted expert in a particular field, who seeks to pass knowledge on to others.
- Maven, a Yiddish word meaning accumulator of knowledge
- In simple terms Maven is a dependency management and build lifecycle management tool
---- a standard way to build the projects
---- a clear definition of what the project consisted of
---- an easy way to publish project information
---- a way to share JARs across several projects

******************************************************
POLYGLOT APPLICATION - JOINT COMPILATION:			 *
******************************************************
- groovy, scala and java joint compilation works as long as
- scala is dependent on groovy and / or java.
- SCALA, RUBY JOINT COMPILATION

******************************************************
MAVEN SCRIPTING:									 *******
******************************************************
- there are several existing plugins available. however if there is any reason why we may need to extend maven there are two options
---- inline scripting
---- custom plugin development
- use antrun
---- http://maven.apache.org/plugins/maven-antrun-plugin/index.html
---- mvn clean
---- mvn verify
- in groovy
---- http://docs.codehaus.org/display/GMAVEN/Home
---- using gmaven plugin
---- inline scripting, local file script, remote file script
---- mvn -f pom-groovy-script.xml clean verify
- in scala
---- http://scala-tools.org/mvnsites/maven-scala-plugin/
---- using maven-scala-plugin
---- inline scripting, local file script, remote file script
---- mvn -f pom-scala-script.xml clean verify

******************************************************
MAVEN PLUGINS (MOJO'S):	    						 *
******************************************************
- java-mojo - WITH MAVENPROJECT INJECTED
---- mvn clean install
---- mvn com.quicksolutions.maven.plugin:java-mojo:1.0-SNAPSHOT:sayhi
- groovy-mojo - WITH MAVENPROJECT INJECTED
---- mvn clean install
---- mvn com.quicksolutions.maven.plugin:groovy-mojo:1.0-SNAPSHOT:sayhi
---- execute is not working
- jruby-mojo
---- WORKS WITH MAVEN 2.2.1 AND NOT HIGHER
---- mvn clean install
---- mvn com.quicksolutions.maven.plugin:jruby-mojo:1.0-SNAPSHOT:sayhi
- scala-mojo - WITH MAVENPROJECT INJECTED
---- http://mvnplugins.fusesource.org/maven/1.10/scala-mojo-support/usage.html
---- 

**********************************************************
POLYGLOT MAVEN - pom.groovy, pom.scala, pom.rb, pom.clj: *******
**********************************************************
- http://polyglot.sonatype.org/
- download from {website above} -> development -> source code
- follow the instructions in development/installs/pmaven-src to build. pmaven-0.8-SNAPSHOT is created
- change the symlink to use pmaven
-------- cd development/installs/symlinks
-------- rm maven
-------- ln -s ../pmaven-0.8-SNAPSHOT maven
- in any application
-------- translate pom.xml pom.groovy
-------- translate pom.xml pom.scala
-------- translate pom.xml pom.rb
-------- translate pom.xml pom.clj
- scala translation has problems. groovy works best
- when the app is installed the groovy pom is copied to repository and not the converted xml
- in android application project
-------- in scala file the configuration is still xml, it is not converted.
- KNOWN ISSUES: in polyglot-application project
-------- in pom.scala in m.pluginRepository and m.repository it should be r.enabled = "true". the value true and false in these lines should be string
-------- when pom.scala is converted back to pom.xml, in build plugin org.scala-tools:maven-scala-plugin the id's are missing for compile, testCompile and doc executions. these do exist in pom.scala
- LIMITATIONS: maven plugins that attempt to modify pom.xml would not work with anything other than xml
---- eg: release plugin

******************************************************
MAVEN ANDROID:										 *******
******************************************************
--- http://code.google.com/p/maven-android-plugin/
--- http://blog.springsource.com/2010/12/17/spring-android-and-maven-part-1/
--- mvn archetype:generate -DarchetypeArtifactId=android-quickstart -DarchetypeGroupId=de.akquinet.android.archetypes -DarchetypeVersion=1.0.5
--- add these lines in pom.xml in <configuration>
--------- <emulator><avd>TestDevice</avd></emulator>
--- mvn clean package
--- show the apk and jar file in target
--- mvn android:emulator-start (wait for a few seconds)
--- mvn android:deploy
--- run the application in the emulator
--- mvn android:emulator-stop
--- POLYGLOT MAVEN WORKS WITH GROOVY AND SCALA WITH THIS PROJECT
-------- however in scala file the configuration is still xml, it is not converted.