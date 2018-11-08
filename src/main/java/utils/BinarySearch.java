package utils;

public class BinarySearch {

    public int binarySearch(Comparable[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (less(key, a[mid])){
                hi = mid -1;
            }
            else if (greater(key, a[mid])){
                lo = mid +1;
            }
            else  return mid;
        }
        return -1;
    }

    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }
}
