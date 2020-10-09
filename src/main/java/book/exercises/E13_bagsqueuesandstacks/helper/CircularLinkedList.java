package book.exercises.E13_bagsqueuesandstacks.helper;

import java.util.Iterator;

public class CircularLinkedList<Item> implements Iterable<Item> {
    private Node<Item> last = null;
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }


    public Item dequeue() {
        // remove the item from the beginning of the list
        Item item = null;
        Node<Item> oldFirst = null;
        if (last != null) {
            if (last.next != null) {
                oldFirst = last.next;
                item = oldFirst.item;
                last.next = last.item != oldFirst.next.item ? oldFirst.next : null;
            } else {
                item = last.item;
                last = null;
            }
            N--;
        }
        return item;
    }

    public void enqueue(Item item) {
        // add item to the end of the list
        Node<Item> oldLast = last;
        last = new Node<>();
        last.item = item;
        last.next = isEmpty() || N == 1 ? oldLast : oldLast.next;
        if (oldLast != null) {
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
        private Node<Item> next;

        private Node() {
        }
    }

    private class ListIterator implements Iterator<Item> {

        private Node<Item> current = last;

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
