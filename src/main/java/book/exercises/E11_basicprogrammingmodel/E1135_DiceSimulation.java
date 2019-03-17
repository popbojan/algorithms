package book.exercises.E11_basicprogrammingmodel;

import java.util.Random;

/**
 *
 * Exercise 1.1.35:
 * Dice simulation. The following code computes the exact probability distribution
 * for the sum of two dice:
 * int SIDES = 6;
 * double[] dist = new double[2*SIDES+1];
 *
 * for(int i = 1; i <= SIDES; i++)
 *  for (int j = 1; j <= SIDES; j++)
 *   dist[i + j] += 1.0;
 *
 * for (int k = 0; k <= 2 * SIDES; k++) {
 *  dist[k] /= 36;
 *
 *  The value dist[i] is the probability that the dice sum to k. Run experiments to validate
 *  this calculation simulating N dice throws, keeping track of the frequencies of occurrence
 *  of each value when you compute the sum of two random integers between 1
 *  and 6. How large does N have to be before your empirical results match the exact results
 *  to three decimal places?
 *
 */
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
