package book.exercises.E13_bagsqueuesandstacks.helper;

import java.util.Iterator;

public class MyQueue<Item> implements Iterable<Item> {
    private Node<Item> first = null;
    private Node<Item> last = null;
    private int N = 0;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public Item dequeue() {
        // remove the item from the beginning of the list
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

    public void enqueue(Item item) {
        // add item to the end of the list
        Node oldLast = last;
        last = new Node<>();
        last.item = item;
        last.next = null;
        if(isEmpty()) {
            first = last;
        }
        else {
            oldLast.next = last;
        }
        N++;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private static class Node<Item> {
        private Item item;
        private MyQueue.Node<Item> next;

        private Node() {
        }
    }

    private class ListIterator implements Iterator<Item> {

        private Node<Item> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
