package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: A new double-ended queue is created with no elements and is smaller or equal to maxListSize.
 *
 *@defines: None
 *
 *@constraints:  0 < LQueue <= maxListSize AND LQueue != "".

 * [queue is not empty AND is size greater than 0.] AND [The queue can store elements of type Double AND The dequeue operation is only allowed when the queue is not empty.]
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     *<Description: Removes and returns the element from the front end of the queue.>
     *
     *@return  [The Double value dequeued from the front of the queue.]
     *
     *@pre [The queue is not empty.]
     *
     *@post [ The front element of the queue is removed, and the size of the queue is reduced by 1] AND [The dequeued element is returned]
     *
     */
    public Double dequeue();

    /**lengthContract
     *<Description: Returns the number of elements currently in the queue.>
     *
     *@return [The length of the queue as an integer.]
     *
     *@pre None.
     *
     *@post [Length of the queue is returned as integer] AND self =#self
     *
     */
    public int length();

    /**toStringContract
     *<Description: Returns a string representation of the elements in the queue.>
     *
     *@return [ A string containing the elements in the queue.]
     *
     *@pre None
     *
     *@post [a string containing the elements in the queue is returned] AND self = #self.
     *
     */
    public String toString();
}
