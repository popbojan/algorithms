package priority.queue;

import sort.Sort;

public class BinaryHeapMaxPQ<Key extends Comparable<Key>> extends Sort {

    protected Key[] pq;
    protected int N;

    public BinaryHeapMaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }


    public Key delMax() {
        Key max = pq[1];
        exchange(pq, 1, N--);
        sink(1);
        pq[N + 1] = null; // prevent loitering
        return max;
    }

    public void insert(Key x) {
        pq[++N] = x;
        swim(N);
    }

    private void swim(int k) {
        while (k > 1 && less(pq, k / 2, k)) {
            exchange(pq, k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(pq, j, j + 1)) {
                j++;
            }
            if (!less(pq, k, j)) {
                break;
            }
            exchange(pq, k, j);
            k = j;
        }
    }

    @Override
    public void sort(Comparable[] a) {

    }
}
