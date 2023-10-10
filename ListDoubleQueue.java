
package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *
 * @invariant: LQueue != null && LQueue.size() <= maxListSize
 * @corresponds: This class represents a queue, where the maximum size of the queue is determined by maxListSize.
 */
public class ListDoubleQueue implements IDoubleQueue
{
    private ArrayList<Double> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContract
     *
     * @param maxSize
     * @pre: maxSize > 0
     * @post: LQueue != null && LQueue.size() == 0 && this.maxListSize == maxSize
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<Double>();
        this.maxListSize = maxSize;
    }

    /**enqueueContract
     *
     * @param val
     * @pre: val != null
     * @post: [LQueue.size() < maxListSize && LQueue.contains(val) && LQueue.size() == old(LQueue.size()) + 1) ||
     *        (LQueue.size() == maxListSize && LQueue.get(maxListSize-1) == val && LQueue.size() == old(LQueue.size())]
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.
    @Override
    public Double dequeue()
    {
        return LQueue.remove(0);
    }

    @Override
    public int length()
    {
        return LQueue.size();
    }

    public String toString()
    {
        String ret = "";
        for(Double d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }
}
