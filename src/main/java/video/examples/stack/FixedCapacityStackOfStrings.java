package video.examples.stack;

public class FixedCapacityStackOfStrings {

    protected String[] s;
    protected int N = 0;

    public FixedCapacityStackOfStrings(int capacity) {
        s = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item) {
        s[N++] = item;
    }

    /**
     * Pops an element from the video.examples.stack represented by this list.  In other
     * words, removes and returns the first element of this list.
     */
    public String pop() {
        return s[--N];
    }

    public void printSize() {
        System.out.println("size: [" + s.length + "]");
    }
}
