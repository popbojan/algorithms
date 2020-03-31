package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.ResizingArrayQueue;

/**
 * Exercise 1.3.14:
 * Develop a class ResizingArrayQueueOfStrings that implements the queue abstraction with a fixed-size array,
 * and then extend your implementation to udse array resizing to remove the size restriction.
 */
public class E1314_ResizingArrayQueue<Item> {

    private ResizingArrayQueue<Item> queue;

    public E1314_ResizingArrayQueue() {
        queue = new ResizingArrayQueue<>();
    }

    public ResizingArrayQueue<Item> getQueue() {
        return queue;
    }
}
