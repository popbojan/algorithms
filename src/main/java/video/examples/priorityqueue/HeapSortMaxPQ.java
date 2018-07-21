package video.examples.priorityqueue;

import video.examples.sort.Sort;

/**
 * converted from 1-based indexing to 0-base indexing
 * in order to work :)
 */
public class HeapSortMaxPQ extends Sort {

    @Override
    public void sort(Comparable[] pq) {

        int N = pq.length;
        //first pass
        for (int k = N / 2; k >= 1; k--) {
            sink(pq, k, N);
        }
        //second pass
        while (N > 1) {
            exchange(pq, 0, N - 1);
            sink(pq, 1, --N);
        }
    }

    protected void sink(Comparable[] pq, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(pq, j - 1, j)) {
                j++;
            }
            if (!less(pq, k - 1, j - 1)) {
                break;
            }
            exchange(pq, k - 1, j - 1);
            k = j;
        }
    }

}
