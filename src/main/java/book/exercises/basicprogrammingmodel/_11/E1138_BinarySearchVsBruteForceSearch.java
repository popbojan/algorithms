package book.exercises.basicprogrammingmodel._11;

public class E1138_BinarySearchVsBruteForceSearch {

    public int bruteForceSearch(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * BinarySearch
     */
    public int rank(int key, int[] a) {
        // Array must be sorted
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            //key is in a[lo..hi] or not present
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }
            if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
