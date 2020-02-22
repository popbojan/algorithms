package book.exercises.E12_dataabstraction.helper;

/**
 * https://www.mathsisfun.com/data/standard-deviation.html
 * https://www.wikihow.com/Calculate-Variance (better and more precise with n-1)
 *
 * try out this one:
 * https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Accumulator.java
 */
public class Accumulator {
    private double m; // average
    private double s; // sum
    private int N; // count


    public void addDataValue(double x) {
        N++;
        s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }

    /**
     *
     * @return Mean (average)
     */
    public double mean() {
        return m;
    }

    /**
     *
     * @return Variance
     * The Variance is defined as:
     * The average of the squared differences from the Mean.
     * To calculate the variance follow these steps:
     * Work out the Mean (the simple average of the numbers)
     * Then for each number: subtract the Mean and square the result (the squared difference).
     * Then work out the average of those squared differences.
     */
    public double var() {
        return s / (N - 1);
    }

    /**
     *
     * @return Standard Deviation
     * The Standard Deviation is a measure of how spread out numbers are
     * Its symbol is σ (the greek letter sigma)
     * The formula is easy: it is the square root of the Variance
     */
    public double stddev() {
        return Math.sqrt(this.var());
    }
}