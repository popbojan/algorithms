package queue;

public class LinkedStackOfQueue {

    private Node last = null;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public void enqueue(String item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        oldlast.next = last;

    }

    /**
     * Pops an element from the stack represented by this list.  In other
     * words, removes and returns the first element of this list.
     */
    public String dequeue() {
        String item = last.item;
        last = last.next;
        return item;
    }
}
