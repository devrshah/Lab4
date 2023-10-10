default: cpsc2151/lab5/ArrayDoubleQueue.java cpsc2151/lab5/ListDoubleQueue.java cpsc2151/lab5/IDoubleQueue.java cpsc2151/lab5/DoubleQueueDriver.java
	javac cpsc2151/lab5/ArrayDoubleQueue.java cpsc2151/lab5/ListDoubleQueue.java cpsc2151/lab5/IDoubleQueue.java cpsc2151/lab5/DoubleQueueDriver.java

run: cpsc2151/lab5/ArrayDoubleQueue.class cpsc2151/lab5/ListDoubleQueue.class cpsc2151/lab5/IDoubleQueue.class cpsc2151/lab5/DoubleQueueDriver.class
	java cpsc2151.lab5.ArrayDoubleQueue cpsc2151.lab5.ListDoubleQueue cpsc2151.lab5.IDoubleQueue cpsc2151.lab5.DoubleQueueDriver

clean:
	rm -f *.class
