default:
	javac -d . com/gradescope/DoubleQueue/code/*.java
	javac -d . Driver/*.java

run:
	java Driver.DoubleQueueDriver

clean:
	find . -name "*.class" -type f -delete