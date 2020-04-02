package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.ResizingArrayQueue;

/**
 * Exercise 1.3.15:
 * Write a Queue client that takes a command-line argument k and prints the kth from the last sting
 * found on standard input (assuming that standard input has k or more strings).
 */
public class E1315_KthItemInQueue<Item> {

    private ResizingArrayQueue<Item> queue;

    public E1315_KthItemInQueue() {
    }

    public Item getKthItem() {
        Item item = null;
        return item;
    }

    public ResizingArrayQueue<Item> getQueue() {
        return queue;
    }
}
