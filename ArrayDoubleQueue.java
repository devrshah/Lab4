
package com.gradescope.DoubleQueue.code;

/**
 * ArrayDoubleQueueContract
 * Array implementation for the T queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue<T> implements IDoubleQueue<T> {
    private T[] queue;
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
     * @post queueMaxSize = maxSize AND self = new T[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize) {

        queueMaxSize = maxSize;
        queue = (T[]) new Object[queueMaxSize];
        size = 0;
    }

    /**
     * enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the  to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND
     *       queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(T val) {

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
    public T dequeue() {
        if (size == 0) {
            return null;
        } else {
            T frontElement = queue[0];

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
    
    @Override
    public String toString() {

        String ret = "";
        for(T d : queue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

    // -----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize() {
        return this.queueMaxSize;
    }

    public T[] getQueue() {
        return this.queue;
    }
}
