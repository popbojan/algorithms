package book.exercises.E13_bagsqueuesandstacks.helper;

public class MyQueue<Item> {
    private MyQueue.Node<Item> first = null;
    private MyQueue.Node<Item> last = null;
    private int N = 0;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public Item dequeue() {
        throw new RuntimeException("Not implemented yet");
    }

    public void enqueue(Item item) {
        // add item to the end of the list
        throw new RuntimeException("Not implemented yet");
    }

    private static class Node<Item> {
        private Item item;
        private MyQueue.Node<Item> next;

        private Node() {
        }
    }
}
