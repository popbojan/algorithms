package book.exercises.E13_bagsqueuesandstacks.helper;

import java.util.Iterator;

public class MyLinkedList<Item> implements Iterable<Item> {
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
        Item item = null;
        if (first != null) {
            item = first.item;
            first = first.next;

            if (isEmpty()) {
                last = null;
            }
            N--;
        }
        return item;
    }

    public void enqueue(Item item) {
        // add item to the end of the list
        Node oldLast = last;
        last = new Node<>();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public void removeLast() {
        for (Node x = first; x != null; x = x.next) {
            if (x.next == last) {
                last = x;
                x.next = null;
                N--;
            } else if (x == last) {
                last = null;
                first = null;
                N--;
            }
        }
    }

    public void insertAfter(Item item, Item after) {
        for (Node x = first; x != null; x = x.next) {
            if (x.item.equals(after)) {
                Node<Item> t = new Node();
                t.item = item;
                t.next = x.next;
                x.next = t;
            }
        }
    }

    public boolean findItem(Item item) {
        boolean hasItem = false;
        for (Node x = first; x != null; x = x.next) {
            if (x.item.equals(item)) {
                hasItem = true;
            }

        }
        return hasItem;
    }

    public void deleteItem(int k) {
        int counter = 0;
        for (Node x = first; x != null; x = x.next) {
            ++counter;
            if (k == 1 && counter == k) {
                //delete first element
                Node next = x.next;
                x = null;
                if (next == last) {
                    first = last;
                }
                N--;
                break;
            } else if (k > 1 && k - 1 == counter) {
                Node nodeForDeletion = x.next;
                x.next = nodeForDeletion.next;
                nodeForDeletion = null;
                N--;
            }
        }
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