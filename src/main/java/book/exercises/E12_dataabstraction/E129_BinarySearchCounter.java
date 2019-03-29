package book.exercises.E12_dataabstraction;

import edu.princeton.cs.algorithms.Counter;
import video.examples.sort.MergeSort;

/**
 * Exercise 1.2.9:
 * Instrument BinarySearch (page 47) to use a Counter to count the total number
 * of keys examined during all searches and then print the total after all searches
 * are complete. Hint: Create a Counter in main() and pass it as an argument to rank().
 */
public class E129_BinarySearchCounter {

    private MergeSort ms;
    private Counter counter;

    public E129_BinarySearchCounter() {
        ms = new MergeSort();
        counter = new Counter("binary");
    }

    public void count() {
        Integer[] a = {1, 2, 5, 9, 7, 11, 3, 4, 1, 2, 3, 19, 15, 13, 14, 16};
        ms.sort(a);
        binarySearch(a, 9, counter);
        System.out.println("Keys examined: " + counter.tally());
    }

    // copied from utils/BinarySearch
    // and amended for this case
    public int binarySearch(Comparable[] a, int key, Counter counter) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (less(key, a[mid], counter)) {
                hi = mid - 1;
            } else if (greaterThan(key, a[mid], counter)) {
                lo = mid + 1;
            } else return mid;
        }
        return -1;
    }

    public boolean less(Comparable v, Comparable w, Counter counter) {
        counter.increment();
        return v.compareTo(w) < 0;
    }

    public boolean greaterThan(Comparable v, Comparable w, Counter counter) {
        counter.increment();
        return v.compareTo(w) > 0;
    }
}
