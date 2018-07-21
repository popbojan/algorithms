package video.examples.sort;

public abstract class Sort {

    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public boolean less(Comparable[] a, int v, int w) {
        return a[v].compareTo(a[w]) < 0;
    }

    public void exchange(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public abstract void sort(Comparable[] a);

    public void shuffle(Comparable[] a) {
    }

    public int medianOf3(Comparable[] a, int left, int right) {
        int center = (left + right) / 2;

        if (less(a[center], a[left])) {
            exchange(a, left, center);
        }

        if (less(a[right], a[left])) {
            exchange(a, left, right);
        }

        if (less(a[right], a[center])) {
            exchange(a, center, right);
        }

        exchange(a, center, right - 1);
        return (int) a[right - 1];
    }

    public Comparable select(Comparable[] a, int k) {
        return null;
    }

}
