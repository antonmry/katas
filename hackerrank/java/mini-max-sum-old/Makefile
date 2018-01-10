# Sources
# https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html
# http://blog.z3bra.org/2013/09/java-without-eclipse.html
# https://github.com/osheroff/java-makefile-tools/
# https://github.com/hasalex/jpms-demo/commits/master/scripts

default: compile

compile: 
	javac Solution.java

run:
	java Solution

test:
	javac -cp lib/apiguardian-api-1.0.0.jar:lib/junit-platform-commons-1.0.0.jar:lib/opentest4j-1.0.0.jar:lib/junit-jupiter-api-5.0.0.jar:lib SolutionTest.java
	java -jar lib/junit-platform-console-standalone-1.0.2.jar --class-path . --scan-class-path .

clean:
	$(RM) *.class *.zip

download:
	curl -O https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.0.2/junit-platform-console-standalone-1.0.2.jar
	curl -O http://search.maven.org/remotecontent?filepath=com/github/stefanbirkner/system-rules/1.16.0/system-rules-1.16.0.jar
