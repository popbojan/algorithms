package book.exercises.E11_basicprogrammingmodel;

import java.util.Random;

public class E1135_DiceSimulation {

    final int SIDES = 6;

    public double getProbabilityDistributionForTheSumOfTwoDice(int d1, int d2) {

        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }

//        printIt(dist);

        for (int k = 0; k <= 2 * SIDES; k++) {
            dist[k] /= 36;
        }

//        printIt(dist);
        return dist[d1 + d2];
    }

    private void printIt(double[] a) {
        for (int k = 2; k <= 2 * SIDES; k++) {
            System.out.println(a[k]);
        }
    }

    public void diceIt(int N) {
        int[] valueFrequency = new int[SIDES+1];
        for (int i = 0; i < N; i++) {
            Random r = new Random();
            int d1 = r.nextInt(SIDES+1);
            int d2 = r.nextInt(SIDES+1);
            valueFrequency[d1]++;
            valueFrequency[d2]++;
            double dist = getProbabilityDistributionForTheSumOfTwoDice(d1, d2);
            System.out.println(dist);
        }
        for (int k = 1; k <= SIDES; k++) {
            System.out.println("value:["+k+"] frequency:["+valueFrequency[k]+"]");
        }
    }
}
