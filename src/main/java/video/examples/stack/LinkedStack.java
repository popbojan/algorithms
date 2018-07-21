package video.examples.stack;

public class LinkedStack<Item> {

    private Node first = null;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    /**
     * Pops an element from the video.examples.stack represented by this list.  In other
     * words, removes and returns the first element of this list.
     */
    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
    }
}
