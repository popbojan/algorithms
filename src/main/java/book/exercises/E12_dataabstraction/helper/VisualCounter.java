package book.exercises.E12_dataabstraction.helper;

import edu.princeton.cs.algorithms.Counter;

public class VisualCounter extends Counter {

    private int count;
    private int N;
    private int max;
    private int operation;

    /**
     * Initializes a new counter starting at 0, with the given id.
     *
     * @param id  the name of the counter
     * @param N   N specifies the maximum number of operations
     * @param max specifies the maximum absolute value for the counter
     */
    public VisualCounter(String id, int N, int max) {
        super(id);
        this.N = N;
        this.max = max;
    }

    /**
     * Increments the counter by 1.
     */
    @Override
    public void increment() {
        if (operation < N && count < max) {
            count++;
            operation++;
        }
    }

    /**
     * Returns the current count.
     */
    @Override
    public int tally() {
        return count;
    }

    public void decrement() {
        if (operation < N &&Math.abs(count) < max) {
            count--;
        }
    }
}
