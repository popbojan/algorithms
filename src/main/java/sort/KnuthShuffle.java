package sort;

import java.util.Random;

public class KnuthShuffle extends Sort{

    private Random rn;

    public KnuthShuffle()
    {
        rn = new Random();
    }

    public void shuffle(Comparable[] a){
        int N =  a.length;
        for(int i=0; i<N; i++){
            int r = rn.nextInt(i + 1);
            exchange(a, i, r);
        }
    }

    @Override
    public void sort(Comparable[] a) {
    }
}
