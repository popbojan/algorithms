package book.exercises.E11_basicprogrammingmodel;

/**
 *
 * Exercise 1.1.15:
 * Write a static method histogram() that takes an array a[] of int values and an
 * integer M as arguments and returns an array of length M whose ith entry is the
 * number of times the integer i appeared in the argument array. If the values in
 * a[] are all between 0 and M-1, the sum of the values in the returned array should
 * be equal to a.length.
 *
 */
public class E1115_Histogram {

    public int[] histogram(int[] a, int M)
    {
        int[] result = new int[M];
        for(int i=0; i<M; i++)
            result[i] = findOccurance(a, i);
        return result;
    }

    // no algorithm in place
    private int findOccurance(int[] a, int key){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == key) {
                sum++;
            }
        }
        return sum;
    }


}
