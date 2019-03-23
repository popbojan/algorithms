package book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.helper.MyInterval2D;
import edu.princeton.cs.algorithms.Interval1D;

import java.util.Random;

/**
 * Exercise 1.2.3
 * Write an MyInterval2D client that takes command-line arguments N, min and max and
 * generates N random 2D intervals whose width and height are uniformly distributed
 * between min and max in the unit square. Draw them on StdDraw and print the number
 * of pairs of intervals that intersect and the number of intervals that are contained
 * in one another.
 * <p>
 * In mathematics, a unit square is a square whose sides have length 1.
 * Often, "the" unit square refers specifically to the square in the
 * Cartesian plane with corners at the four points (0, 0), (1, 0), (0, 1), and (1, 1).
 * <p>
 * A uniform distribution, sometimes also known as a rectangular distribution,
 * is a distribution that has constant probability.
 * In probability theory and statistics, the continuous uniform distribution or rectangular
 * distribution is a family of symmetric probability distributions such that for each member
 * of the family, all intervals of the same length on the distribution's support are equally
 * probable.
 * The distribution is defined by two parameters, a and b:
 * a is the minimum
 * b is the maximum
 * <p>
 * The uniform distribution is a continuous probability distribution and is
 * concerned with events that are equally likely to occur.
 */
public class E123_Interval2DClient {

    private Random random;

    public E123_Interval2DClient() {
        random = new Random();
    }

    public void printIntervalsThatIntersectAndThatAreContainedInOneAnother(int N, double min, double max) {
        MyInterval2D[] intervals2D = getN2DIntervals(N, min, max);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (intervals2D[i].intersects(intervals2D[j])) {
                    System.out.println("Intersect :[ I2D 1: " + intervals2D[i].toString() + " I2D 2: " + intervals2D[j].toString() + "]");
                }
                if (intervals2D[i].contains(intervals2D[j])) {
                    System.out.println("Contained in one another :[ I2D 1: " + intervals2D[i].toString() + " I2D 2: " + intervals2D[j].toString() + "]");
                }
            }
        }
    }

    /**
     * Within a unit square which is defined by (0, 0), (1, 0), (0, 1), and (1, 1) point,
     * yield N random 2-Dimensional intervals whose width and height conform uniform distribution
     * defined by lowest value of length a(min) and highest value of length b(max)
     */
    private MyInterval2D[] getN2DIntervals(int N, double min, double max) {
        MyInterval2D[] intervals2D = new MyInterval2D[N];
        for (int i = 0; i < N; i++) {
            intervals2D[i] = get2DIntervalFromMinAndMax(min, max);
        }
        return intervals2D;
    }

    private MyInterval2D get2DIntervalFromMinAndMax(double min, double max) {
        double xLeft = getRandomBetweenAandB(min, max);
        double xRight = getRandomBetweenAandB(xLeft, max);
        Interval1D x = new Interval1D(xLeft, xRight);
        double yLeft = getRandomBetweenAandB(min, max);
        double yRight = getRandomBetweenAandB(yLeft, max);
        Interval1D y = new Interval1D(yLeft, yRight);
        return new MyInterval2D(x, y);
    }

    double getRandomBetweenAandB(double a, double b) {
        if (b <= a) {
            throw new IllegalArgumentException("Invalid range");
        }
        return a + random.nextDouble() * (b - a);
    }
}
