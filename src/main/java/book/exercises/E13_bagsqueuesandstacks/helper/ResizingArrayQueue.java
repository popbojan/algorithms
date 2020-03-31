package book.exercises.E13_bagsqueuesandstacks.helper;

import java.util.Iterator;

public class ResizingArrayQueue<Item> implements Iterable<Item> {

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
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
