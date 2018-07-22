package book.exercises.basicprogrammingmodel;

public class HistogramE1115 {

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
