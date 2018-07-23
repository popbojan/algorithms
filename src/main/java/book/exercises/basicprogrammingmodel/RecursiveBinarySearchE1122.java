package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

public class RecursiveBinarySearchE1122 {

    public void printRecursiveDepth() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int key = 17;

        // prints out the position of key in the array a, actually it's index
        System.out.println("Index of the key "+key+" is: ["+rank(key, a)+"]");
    }

    private int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    private int rank(int key, int[] a, int lo, int hi, int depth) {
        // index of key in a[], if present,
        // is not smaller than lo and larger than hi

        //for the sake of the exercise print out values of lo and hi
        depth++;
        StdOut.println("Depth: ["+depth+"]  LO: ["+lo+"]  HI: ["+hi+"]");

        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if(key < a[mid]){
            return rank(key, a, lo, mid-1, depth);
        }
        else if (key > a[mid]){
            return rank(key, a, mid+1, hi, depth);
        }
        else
            return mid;
    }
}
