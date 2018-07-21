package video.examples.sort;

public class QuickSort extends KnuthShuffle {

    @Override
    public void sort(Comparable[] a) {
        shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        // improve quick video.examples.sort by estimating partition element to be around middle by introducing medianOf3
        int m = medianOf3(a, lo, hi);
        exchange(a, lo, m);

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    protected int partition(Comparable[] a, int lo, int hi) {
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
