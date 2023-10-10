package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: 0 <= queue size <= maxListSize
 [A new double-ended queue is created with no elements and is of maxListSize.]
 *
 *@defines: queue size <= maxListSize
 *
 *@constraints:  0 <= queue size <= maxListSize 
 * maxListSize > 0
 * [queue is not empty AND is size greater than 0.] AND [The queue can store elements of type T AND The dequeue operation is only allowed when the queue is not empty.]
 *
 */

public interface IDoubleQueue<T>
{

    //This function's contracts are in the individual classes
    public void enqueue(T val);

    /**dequeueContract
     *<Description: Removes and returns the element from the front end of the queue.>
     *
     *@return  Returns the T value dequeued from the front of the queue.
     *
     *@pre 0 < queue size [The queue is not empty.]
     *
     *@post [ The front element of the queue is removed, and the size of the queue is reduced by 1] AND [The dequeued element is returned]
     *
     */
    public T dequeue();

    /**lengthContract
     *<Description: Returns the number of elements currently in the queue.>
     *
     *@return Returns the length of the queue as an integer.
     *
     *@pre queue != NULL.
     *
     *@post [Length of the queue is returned as integer] AND self =#self
     *
     */
    public int length();

    /**toStringContract
     *<Description: Returns a string representation of the elements in the queue.>
     *
     *@return Returns a string containing the elements in the queue.
     *
     *@pre queue != NULL.
     *
     *@post [a string containing the elements in the queue is returned as: [#] [#]... [#] ] AND self = #self.
     *
     */
    public String toString();

    /**peekContract
     *<Description: Returns the element at the front of the queue without removing it.>
     *
     *@return Returns the front element of the queue.
     *
     *@pre 0 < queue size [The queue is not empty.]
     *
     *@post [The queue remains unchanged] AND [The front element of the queue is returned]
     *
     */
    default T peek() {
        if(length() <= 0) return null;
        T frontItem = dequeue();
        enqueue(frontItem);
        return frontItem;
    }
}
