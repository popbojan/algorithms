package book.exercises.E11_basicprogrammingmodel;

import java.util.Random;

/**
 *
 * Bad shuffling. Suppose that you choose a random integer between 0 and N-1
 * in our shuffling code instead of one between i and N-1. Show that resulting order is
 * not equally likely to be one of the N! possibilities. Run the test of the previous exercise
 * for this version
 *
 */
public class E1137_BadShuffling {

    Random random;
    private double[] numbers;
    private double[] initPositions;
    private int[][] numberPositionFrequency;

    public E1137_BadShuffling() {
        random = new Random();
    }

    public void Nshuffles(int M, int N) {
        numbers = new double[M];
        initPositions = new double[M];
        numberPositionFrequency = new int[M][M];

        populateArrays(numbers, initPositions);

        for (int i = 0; i < N; i++) {
            shuffle(numbers);

            for (int j = 0; j < M; j++) {
                numberPositionFrequency[j][getPosition(numbers[j])]++;
            }
        }

        printMbyM();
    }

    private void printMbyM() {
        for (int i = 0; i < numberPositionFrequency.length; i++) {
            System.out.println();
            System.out.println("Position: " + "[" + i + "]");
            for (int j = 0; j < numberPositionFrequency.length; j++) {
                System.out.println("Number: " + "[" + numbers[j] + "]" + " Times: " + "[" + numberPositionFrequency[i][j] + "]");
            }
        }
    }

    private double[] shuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // exchange a[i] with random element in a[i..N-1]
            int r = 0 + random.nextInt(N - i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        return a;
    }

    private void populateArrays(double[] numbers, double[] initPositions) {
        for (int i = 0; i < numbers.length; i++) {
            double value = random.nextDouble();
            numbers[i] = value;
            initPositions[i] = value;
        }
    }

    private int getPosition(double number) {
        for (int i = 0; i < initPositions.length; i++) {
            if (initPositions[i] == number) {
                return i;
            }
        }
        return -1;
    }

}
