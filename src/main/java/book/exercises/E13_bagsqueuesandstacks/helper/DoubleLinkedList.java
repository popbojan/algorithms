package book.exercises.E13_bagsqueuesandstacks.helper;

public class DoubleLinkedList<Item> {

    private Node<Item> first = null;
    private Node<Item> last = null;
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public void insertAtTheEnd(Item item) {
        // add item to the end of the list
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        last.previous = oldLast;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public void insertAtTheBeginning(Item item) {
        // add item at the beginning of the list
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        first.previous = null;
        if (isEmpty()) {
            last = first;
        } else {
            oldFirst.previous = first;
        }
        N++;
    }

    public Item removeFromTheBeginning() {
        // remove the item from the beginning of the list
        Item item = null;
        if (first != null) {
            item = first.item;
            first = first.next;
            if (N > 1 && first != null) {
                first.previous = null;
            } else {
                //if (isEmpty()) {
                last = null;
            }
            N--;
        }
        return item;
    }

    public Item removeFromTheEnd() {
        // remove the item from the end of the list
        Item item = null;
        if (last != null) {
            item = last.item;
            last = last.previous;
            if (N > 1 && last != null) {
                last.next = null;
            } else {
                first = null;
            }
            N--;
        }
        return item;
    }

    public void insertBefore(Item before, Item item) {
        for (Node x = first; x != null && item != null && before != null; x = x.next) {
            if (x.item.equals(before)) {
                Node<Item> t = new Node();
                t.item = item;
                t.next = x;
                t.previous = x.previous;
                if (x == first) {
                    first = t;
                } else {
                    x.previous.next = t;
                }
                x.previous = t;
                N++;
                break;
            }
        }
    }

    public void insertAfter(Item after, Item item) {
        for (Node x = first; x != null && item != null && after != null; x = x.next) {
            if (x.item.equals(after)) {
                Node<Item> t = new Node();
                t.item = item;
                t.next = x.next;
                t.previous = x;
                if (x == last) {
                    last = t;
                } else {
                    x.next.previous = t;
                }
                x.next = t;
                N++;
                break;
            }
        }
    }

    public void remove(Item item) {
        for (Node x = first; x != null && item != null; x = x.next) {
            if (x.item.equals(item)) {
                if (x == first) {
                    first = x.next;
                } else {
                    x.previous.next = x.next;
                }
                if (x == last) {
                    last = x.previous;
                } else {
                    x.next.previous = x.previous;
                }
            }
        }
    }


    private static class Node<Item> {
        private Item item;
        private Node<Item> previous;
        private Node<Item> next;

        private Node() {
        }
    }
}