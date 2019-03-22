package book.exercises.E12_dataabstraction;

/**
 *
 * Exercise 1.2.3
 * Write an Interval2D client that takes command-line arguments N, min and max and
 * generates N random 2D intervals whose width and height are uniformly distributed
 * between min and max in the unit square. Draw them on StdDraw and print the number
 * of pairs of intervals that intersect and the number of intervals that are contained
 * in one another.
 *
 * In mathematics, a unit square is a square whose sides have length 1.
 * Often, "the" unit square refers specifically to the square in the
 * Cartesian plane with corners at the four points (0, 0), (1, 0), (0, 1), and (1, 1).
 *
 * A uniform distribution, sometimes also known as a rectangular distribution,
 * is a distribution that has constant probability.
 * In probability theory and statistics, the continuous uniform distribution or rectangular
 * distribution is a family of symmetric probability distributions such that for each member
 * of the family, all intervals of the same length on the distribution's support are equally
 * probable.
 * The distribution is defined by two parameters, a and b:
 *    a is the minimum
 *    b is the maximum
 *
 */
public class E123_Interval2D {





    /**
     * yields N 2D intervals whose width and height are uniformly distributed
     * between min and max in the unit square.
     */
    private double[] getN2DIntervals(int N, double min, double max) {
        double range = max - min;
        double rangeStart = min;
        double steps = N - 1; // always one less than the total amount of numbers
        double step = range / steps;
        double[] intervals = new double[N];
        intervals[0] = rangeStart;
        for (int i = 1; i < N; i++) {
            intervals[i] = rangeStart + step;
            rangeStart = intervals[i];
        }
        return intervals;
    }

}
