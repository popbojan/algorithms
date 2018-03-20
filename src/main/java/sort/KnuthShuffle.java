package sort;

import java.util.Random;

public class KnuthShuffle extends Sort {

    private Random rn;

    public KnuthShuffle() {
        rn = new Random();
    }

    @Override
    public void shuffle(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = rn.nextInt(i + 1); // between 0 and i
            exchange(a, i, r);
        }
        super.shuffle(a);
    }

    @Override
    public void sort(Comparable[] a) {
    }
}
