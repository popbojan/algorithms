package stack;

public class ResizingArrayStackOfStrings extends FixedCapacityStackOfStrings {

    public ResizingArrayStackOfStrings(int capacity) {
        super(capacity);
    }

    @Override
    public void push(String item) {
        if (N == s.length) {
            resize(2 * s.length);
        }
        super.push(item);
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    @Override
    public String pop() {
        String item = super.pop();
        s[N] = null;
        if (N > 0 && N == s.length / 4) {
            resize(s.length / 2);
        }
        return item;
    }
}
