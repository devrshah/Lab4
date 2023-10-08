package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures:
 *
 *@defines: 
 *
 *@constraints:
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     *
     *
     *@return  The Double value dequeued from the front of the queue.
     *
     *@pre The queue is not empty.
     *
     *@post [ The front element of the queue is removed, and the size of the queue is reduced by 1]
     *
     */
    public Double dequeue();

    /**lengthContract
     *
     *
     *@return the number of elemts currently in the queue
     *
     *@pre None.
     *
     *@post [Length of the queue is returned]
     *
     */
    public int length();

    /**toStringContract
     *
     *
     *@return A string representation of the elements in the queue.
     *
     *@pre None
     *
     *@post [a string representation of its elements is returned]
     *
     */
    public String toString();
}

