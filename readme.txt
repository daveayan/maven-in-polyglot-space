========================================================================================
USING MAVEN:
Maven version used here is 3.0.2
Refer to runme.txt in each project on more information to run / use each project

USING PMAVEN:
pmaven is polyglot maven built by Sonatype. At the time of this writing it is built on top of Apache Maven version 3.0. http://polyglot.sonatype.org/

ISSUES USING PMAVEN:
If pom.groovy or pom.scala files are used instead of pom.xml the release plugin and other plugins that attempt to read pom.xml would not work. One way to work around this is the convert pom.groovy or pom.scala to pom.xml just before running the mvn command and then delete the generated pom.xml in the end
========================================================================================
