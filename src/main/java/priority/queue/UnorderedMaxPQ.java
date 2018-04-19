package priority.queue;

import sort.Sort;

public class UnorderedMaxPQ<Key extends Comparable<Key>> extends Sort {

    private Key[] pq;
    private int N;

    public UnorderedMaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity];  //no generic array creation
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(Key x) {
        pq[N++] = x;
    }

    public Key delMax() {
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (less(max, i)) {
                max = i;
            }
        }
        exchange(pq, max, N - 1);
        return pq[--N];
    }

    @Override
    public void sort(Comparable[] a) {

    }
}
