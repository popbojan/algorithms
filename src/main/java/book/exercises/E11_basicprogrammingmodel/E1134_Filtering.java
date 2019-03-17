package book.exercises.E11_basicprogrammingmodel;

import java.util.Random;

/**
 *
 * Exercise 1.1.34:
 * Filtering. Which of the following require saving all the values from standard
 * input (in an array, say), and which could be implemented as a filter using only a fixed
 * number of variables and arrays of fixed size (not dependent on N)? For each, the input
 * comes from standard input and consists of N real numbers between 0 and 1.
 *
 *  - Print the maximum and minimum numbers.
 *  - Print the median of the numbers.
 *  - Print the kth smallest value, for k less than 100.
 *  - Print the sum of the squares of the numbers.
 *  - Print the average of the N numbers.
 *  - Print the percentage of numbers greater than the average.
 *  - Print the N numbers in increasing order.
 *  - Print the N numbers in random order.
 *
 */
public class E1134_Filtering {


    public void printMaximumAndMinimum(double[] N) {
        sort(N);
        System.out.println("minimum:" + N[0]);
        System.out.println("maximum:" + N[N.length - 1]);
    }

    public void printMedian(double[] N) {
        double[] sort = sort(N);
        double median;
        int middle = (sort.length + 1) / 2;
        if ((sort.length + 1) % 2 != 0) {
            median = (N[middle - 1] + N[middle]) / 2;
        } else {
            median = sort[middle - 1]; //index goes from 0
        }

        System.out.println(median);

    }

    public double printKthSmallestValue(double[] N, int k) {
        return sort(N)[k];
    }

    public void printSumOfTheSquaresOfTheNumbers(double[] N) {
        double sum = 0;
        for (double d : N) {
            sum += d * d;
        }
        System.out.println(sum);
    }

    public double getAverageOfTheNNumbers(double[] N) {
        double sum = 0;
        for (double d : N) {
            sum += d;
        }
        double average = sum / N.length;
        return average;
    }

    public void printThePercentageOfTheNumbersGreaterThanTheAverage(double[] N) {
        double average = getAverageOfTheNNumbers(N);
        int counter = 0;
        for (double d : N) {
            if (d > average) {
                counter++;
            }
        }
        double percentage = counter * 100 / N.length;

        System.out.println(percentage);
    }

    public void printNNumbersInIncreasingOrder(double[] N) {
        double[] sorted = sort(N);
        print(N);
    }

    public void printNNumbersInRandomOrder(double[] N) {
        double[] shuffled = shuffle(N);
        print(N);
    }

    private double[] sort(double[] N) {
        for (int j = 0; j < N.length; j++) {
            for (int i = 0; i < N.length - 1; i++) {
                if (N[i] > N[i + 1]) {
                    double temp = N[i];
                    N[i] = N[i + 1];
                    N[i + 1] = temp;
                }
            }
        }
        return N;
    }

    private double[] shuffle(double[] N) {
        Random r = new Random();
        for (int i = 0; i < N.length; i++) {
            int lastIndexInArray = N.length - 1;
            int i1 = r.nextInt(lastIndexInArray);
            int i2 = r.nextInt(lastIndexInArray);
            double temp = N[i1];
            N[i1] = N[i2];
            N[i2] = temp;
        }
        return N;
    }

    private void print(double[] N) {
        for (double d : N) {
            System.out.println(d);
        }
    }
}
