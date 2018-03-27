package sort;

public class MergeSort extends Sort {

    private final int CUTOFF = 7;

    private void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
            System.out.println(aux[k]);
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {// if i element is exhausted move to j
                a[k] = aux[j++];
            } else if (j > hi) { // if j element is exhausted move to i
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                System.out.println("aux of  i" + aux[i]);
                System.out.println("aux of j" + aux[j]);
                a[k] = aux[j++];
            } else {
                System.out.println("aux of  i" + aux[i]);
                System.out.println("aux of j" + aux[j]);
                a[k] = aux[i++];
            }
        }

    }

    private void mergeSort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        /** use insertion sort when array, that needs to be sorted, is up to 7 items
         * in order to have more faster algorithm          */
        if (hi <= lo + CUTOFF - 1) {
            Sort insertion = new InsertionSort();
            insertion.sort(a);
            return;
        }

        int mid = lo + (hi - lo) / 2;

        mergeSort(a, aux, lo, mid);
        mergeSort(a, aux, mid + 1, hi);

        /** if it's already in order skip merging */
        if (!less(a[mid + 1], a[mid])) {
            return;
        }

        merge(a, new Comparable[a.length], lo, mid, hi);
    }

    @Override
    public void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        Comparable[] aux = new Comparable[a.length];
        mergeSort(a, aux, lo, hi);
    }
}
