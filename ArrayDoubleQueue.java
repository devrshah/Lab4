
package com.gradescope.DoubleQueue.code;

/**
 * ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue implements IDoubleQueue {
    private Double[] queue;
    private int queueMaxSize;
    private int size;

    /**
     * ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize) {

        queueMaxSize = maxSize;
        queue = new Double[queueMaxSize];
        size = 0;
    }

    /**
     * enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND
     *       queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(Double val) {

        if (size < queueMaxSize) {
            queue[size] = val;
            size++;
        }else{

            queue[queueMaxSize - 1] = val;
        }
    }

    // Note: The below 3 functions intentionally do not have contracts. You do not
    // need to add them.

    @Override
    public Double dequeue() {
        if (size == 0) {
            return null;
        } else {
            Double frontElement = queue[0];

            for (int i = 0; i < size - 1; i++) {
                queue[i] = queue[i + 1];
            }

            queue[size - 1] = null;
            size--;

            return frontElement;
        }

    }

    @Override
    public int length() {
        return size;
    }

    public String toString() {

        String ret = "";
        for(Double d : queue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

    // -----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize() {
        return this.queueMaxSize;
    }

    public Double[] getQueue() {
        return this.queue;
    }
}
