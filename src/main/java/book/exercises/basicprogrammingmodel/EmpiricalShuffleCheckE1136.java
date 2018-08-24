package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdRandom;

import java.util.Random;

public class EmpiricalShuffleCheckE1136 {

    Random random;

    public EmpiricalShuffleCheckE1136() {
        random = new Random();
    }

    private double[] shuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // exchange a[i] with random element in a[i..N-1]
            StdRandom.uniform(i);
            int r = i + random.nextInt(N - i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        return a;
    }


}
