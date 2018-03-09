package stack;

public class FixedCapacityStack<Item> {

    protected Item[] s;
    protected int N = 0;

    public FixedCapacityStack(int capacity) {
        s = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item) {
        s[N++] = item;
    }

    /**
     * Pops an element from the stack represented by this list.  In other
     * words, removes and returns the first element of this list.
     */
    public Item pop() {
        return s[--N];
    }

    public void printSize() {
        System.out.println("size: [" + s.length + "]");
    }
}
