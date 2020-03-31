package book.exercises.E13_bagsqueuesandstacks.helper;

import java.util.Iterator;

public class ResizingArrayQueue<Item> implements Iterable<Item> {

    private Item[] a;
    private int N = 0;
    private int index = 0;

    public ResizingArrayQueue() {
        a = (Item[]) new Object[1];
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void enqueue(Item item) {
        if (N == a.length) {
            resizeArray(a.length * 2);
        }
        a[N++] = item;
    }

    public Item dequeue() {
        Item item = a[index];
        a[index++] = null;
        N--;
        if (a.length / 4 > N) {
            resizeArray(a.length / 2);
        }
        return item;
    }

    public int arraySize() {
        return a.length;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private void resizeArray(int maxSize) {
        Item[] temp = (Item[]) new Object[maxSize];
        for (int i = 0; i < maxSize && index < N; i++) {
            temp[i] = a[index];
            a[index++] = null;
        }
        a = temp;
        index = 0;
    }

    private class ArrayIterator implements Iterator<Item> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }

        @Override
        public void remove() {
        }
    }
}
