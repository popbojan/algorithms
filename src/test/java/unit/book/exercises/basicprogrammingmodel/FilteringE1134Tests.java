package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.FilteringE1134;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilteringE1134Tests {

    FilteringE1134 f;
    final double INCONSIDERABLE_DIFFERENCE = 0.1;

    @Before
    public void setup() {
        f = new FilteringE1134();
    }

    @Test
    public void test_printMaximumAndMinimum() {
        double[] N = {0.8, 0.1, 0, 0.9, 0.754};
        f.printMaximumAndMinimum(N);
    }

    @Test
    public void test_printMedian_returnsMiddleNumber() {
        double[] N = {0.8, 0.1, 0, 0.9, 0.754};
        f.printMedian(N);
    }

    @Test
    public void test_printMedian_returnsMiddleBetweenMedianPairs() {
        double[] N = {0.8, 0.1, 0, 0.9, 0.754, 0.3};
        f.printMedian(N);
    }

    @Test
    public void test_printKthSmallestValue() {
        double[] N = {1, 10, 3, 44, 28, 59, 77, 88, 21, 23, 6, 9, 11, 17, 33, 18};
        int k = 8;
        Assert.assertEquals(21, f.printKthSmallestValue(N, k), INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_printSumOfTheSquaresOfTheNumbers() {
        double[] N = {1, 10, 3, 44, 28, 59, 77, 88, 21, 23, 6, 9, 11, 17, 33, 18};
        f.printSumOfTheSquaresOfTheNumbers(N);
    }

    @Test
    public void test_getAverageOfTheNNumbers() {
        double[] N = {1, 10, 3, 44, 28, 59, 77, 88, 21, 23, 6, 9, 11, 17, 33, 18};
        double average = f.getAverageOfTheNNumbers(N);
        System.out.println(average);
    }

    @Test
    public void test_printThePercentageOfTheNumbersGreaterThanTheAverage() {
        double[] N = {1, 10, 3, 44, 28, 59, 77, 88, 21, 23, 6, 9, 11, 17, 33, 18};
        f.printThePercentageOfTheNumbersGreaterThanTheAverage(N);
    }
}
