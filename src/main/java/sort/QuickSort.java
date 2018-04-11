package sort;

public class QuickSort extends Sort {

    @Override
    public void sort(Comparable[] a) {

    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) { // find item on left to swap
                if (i == hi) {
                    break;
                }
            }
            while (less(a[lo], a[--j])) {  //find item on right to swap
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            exchange(a, i, j);
        }

        exchange(a, lo, j);
        return j;
    }


}
