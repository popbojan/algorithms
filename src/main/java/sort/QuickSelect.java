package sort;

public class QuickSelect extends QuickSort {

    /**
     * Used to find min (k=0), max (k=N-1), median (k=N/2)
     * eg find top k
     */
    @Override
    public Comparable select(Comparable[] a, int k) {
        shuffle(a);
        int lo = 0, hi = a.length - 1;
        while (hi > lo) {
            int j = partition(a, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                return a[k];
            }
        }
        return a[k];
    }


}
