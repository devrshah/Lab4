package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *
 * @invariant: LQueue != null && LQueue.size() <= maxListSize
 * @corresponds: This class represents a queue, where the maximum size of the queue is determined by maxListSize.
 */
public class ListDoubleQueue<T> implements IDoubleQueue<T>
{
    private ArrayList<T> LQueue;
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
        this.LQueue = (T[]) new Object[maxListSize];
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
    public void enqueue(T val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.
    @Override
    public T dequeue()
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
        for(T d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }
}
