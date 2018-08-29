package book.exercises.basicprogrammingmodel;

import java.util.Random;

public class EmpiricalShuffleCheckE1136 {

    Random random;
    private double[] numbers;
    private double[] initPositions;
    private double[][] numberPositionFrequency;

    public EmpiricalShuffleCheckE1136() {
        random = new Random();
    }

    public void Nshuffles(int M, int N) {
        numbers = new double[M];
        initPositions = new double[M];
        numberPositionFrequency = new double[M][M];

        populateArrays(numbers, initPositions);

        for (int i = 0; i < N; i++) {
            shuffle(numbers);

            for (int j = 0; j < M; j++) {
                numberPositionFrequency[j][getPosition(numbers[j])]++;
            }
        }
    }

    private void printMbyM(double[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

            }
        }
    }

    private double[] shuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // exchange a[i] with random element in a[i..N-1]
            int r = i + random.nextInt(N - i);
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
