package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

public class RecursiveBinarySearchE1122 {

    int[] a;
    final boolean PRINT_DEPTH = false;

    public RecursiveBinarySearchE1122() {
        a = new int[]{1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 8, 9, 10, 11, 12, 13, 14, 14, 15, 16, 17, 17, 17, 17};
    }

    public void printRecursiveDepth() {
        int key = 17;

        // prints out the position of key in the array a, actually it's index
        System.out.println("Index of the key " + key + " is: [" + rank(key, a) + "]");
    }

    private int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    private int rank(int key, int[] a, int lo, int hi, int depth) {
        // index of key in a[], if present,
        // is not smaller than lo and larger than hi

        //for the sake of the exercise print out values of lo and hi
        depth++;
        if (PRINT_DEPTH) {
            StdOut.println("Depth: [" + depth + "]  LO: [" + lo + "]  HI: [" + hi + "]");
        }
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth);
        } else
            return mid;
    }

    public void printNotFoundNumbers() {
        int[] keys = {9, 22, 17, 18, 25};
        for (int i = 0; i < keys.length; i++) {
            if (rank(keys[i], a) < 0) {
                StdOut.println("Not found: [" + keys[i] + "]");
            }
        }

    }

    public void printFoundNumbers() {
        int[] keys = {1, 7, 9, 22, 17, 18, 25};
        for (int i = 0; i < keys.length; i++) {
            if (rank(keys[i], a) >= 0) {
                StdOut.println("Found: [" + keys[i] + "]");
            }
        }
    }

    public void printFoundNumbersFromDistinctArray() {
        int[] a = getDistinctArray();
        int[] keys = {1, 7, 9, 22, 17, 18, 25};
        for (int i = 0; i < keys.length; i++) {
            if (rank(keys[i], a) >= 0) {
                StdOut.println("Found: [" + keys[i] + "]");
            }
        }
    }

    public void printFoundNumbersAndCountOfSmallerNumbersThanTheFoundedOnePlusCountOfElementsEqualToTheKey() {
        int[] keys = {1, 7, 9, 22, 17, 18, 25};
        for (int i = 0; i < keys.length; i++) {
            int rank = rank(keys[i], a);
            if (rank >= 0) {
                StdOut.println("Found: [" + keys[i] + "] Smaller numbers: [" + rank + "] Key equal: [" + getKeyDuplicatesCount(rank) + "]");
            }
        }
    }

    private int[] getDistinctArray() {
        int[] distinctA = new int[a.length - countADuplicates()];
        int distinctIncrement = 1;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                distinctA[0] = a[i];
            } else {
                if (a[i] != a[i - 1]) {
                    distinctA[distinctIncrement] = a[i];
                    distinctIncrement++;
                }
            }
        }
        return distinctA;
    }

    private int countADuplicates() {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && a[i] == a[i - 1]) {
                counter++;
            }
        }
        return counter;
    }

    private int getKeyDuplicatesCount(int key) {
        int counter = 0;
        for (int i = key; i < a.length; i++) {
            if (a[i] == a[key]) {
                counter++;
            }
        }
        return counter;
    }
}
