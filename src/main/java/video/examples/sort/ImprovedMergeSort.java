package video.examples.sort;

public class ImprovedMergeSort extends MergeSort {

    @Override
    protected void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        int i = lo, j = mid + 1;
        // merge  from a[] to aux[]
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                aux[k] = a[j++];
            } else if (j > hi) {
                aux[k] = a[i++];
            } else if (a[j] != null &&  a[i] != null && less(a[j], a[i])) {
                aux[k] = a[j++];
            } else if(a[j] == null &&  a[i] == null){
                continue;
            } else {
                aux[k] = a[i++];
            }
        }
    }

    @Override
    protected void mergeSort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int mid = lo + (hi - lo) / 2;

        mergeSort(aux, a, lo, mid);
        mergeSort(aux, a, mid + 1, hi);

        merge(a, aux, lo, mid, hi);
    }

}
