# Sources
# https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html
# http://blog.z3bra.org/2013/09/java-without-eclipse.html
# https://github.com/osheroff/java-makefile-tools/
# https://github.com/hasalex/jpms-demo/commits/master/scripts
libpath = /home/antonmry/Workspace/Outros/katas/hackerrank/lib

default: compile

compile:
	javac Solution.java

run:
	java Solution

test:
	javac -cp .:$(libpath)/hamcrest-core-1.3.jar:$(libpath)/junit-4.12.jar:$(libpath)/system-rules-1.16.0.jar SolutionTest.java
	java -cp .:$(libpath)/hamcrest-core-1.3.jar:$(libpath)/junit-4.12.jar:$(libpath)/system-rules-1.16.0.jar  org.junit.runner.JUnitCore SolutionTest

clean:
	$(RM) *.class *.zip

# TODO: migrate to JUNIT 5
download:
	curl -O https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.0.2/junit-platform-console-standalone-1.0.2.jar
	curl -O http://search.maven.org/remotecontent?filepath=com/github/stefanbirkner/system-rules/1.16.0/system-rules-1.16.0.jar


# TODO: generate .classpath from here
