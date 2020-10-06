package book.exercises.E13_bagsqueuesandstacks.helper;

import java.util.Iterator;

public class MyLinkedList<Item> implements Iterable<Item> {
    private Node<Item> first = null;
    private Node<Item> last = null;
    private int N = 0;
    private int maxValue;

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

    public void removeAfter(Item item) {
        for (Node x = first; x != null; x = x.next) {
            if (x.item.equals(item) && x != last) {
                Node nodeToBeRemove = x.next;
                x.next = nodeToBeRemove.next;
                N--;
                break;
            }
        }
    }

    public void removeAll(Item item) {
        Node previous = null;
        for (Node x = first; x != null; x = x.next) {
            if (!x.item.equals(item)) { //update and keep last
                last = x;
            }
            if (x == first && x.item.equals(item)) { //first
                first = x.next;
                N--;
            } else if (previous != null && x.item.equals(item)) {
                previous.next = x.next;
                N--;
            }
            previous = x;
        }
        last.next = null;
    }

    public void pointToItself(Item item, Item after) {
        for (Node x = first; x != null; x = x.next) {
            if (x.item.equals(after)) {
                Node<Item> t = new Node<>();
                x.next = t;
                t.next = x.next;
                break;
            }
        }
    }

    public void insertAfter(Item item, Item after) {
        for (Node x = first; x != null && item != null && after != null; x = x.next) {
            if (x.item.equals(after)) {
                Node<Item> t = new Node();
                t.item = item;
                t.next = x.next;
                x.next = t;
                N++;
                break;
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
                if (next == last) {
                    first = last;
                }
                N--;
                break;
            } else if (k > 1 && k - 1 == counter) {
                Node nodeForDeletion = x.next;
                x.next = nodeForDeletion.next;
                N--;
            }
        }
    }

    public int max() {
        if (size() == 0)
            return 0;
        int maxValue = 0;
        for(Node x = this.first; x != null; x = x.next){
            int current = (int) x.item;
            if(current > maxValue)
                maxValue = current;
        }
        return maxValue;
    }


    public int maxRecursive() {
        if (size() == 0)
            return 0;
        maxValue = 0;
        setMaxValueRecursively(this.first);
        return maxValue;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private void setMaxValueRecursively(Node x){
        if(x.next != null){
            int current = (int) x.item;
            if(current > maxValue){
                maxValue = current;
            }
            setMaxValueRecursively(x.next);
        }
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
