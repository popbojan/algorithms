package sort;

public class MergeSort extends Sort {

    private void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) { // if i element is exhausted move to j
                a[k] = aux[j++];
            } else if (j > hi) { // if j element is exhausted move to i
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }

    @Override
    public void sort(Comparable[] a) {
        int lo = 0;
        int mid = a.length / 2;
        int hi = a.length - 1;

        merge(a, a, lo, mid, hi);
    }
}
