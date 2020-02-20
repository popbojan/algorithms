package book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.helper.Accumulator;

/**
 * Exercise 1.2.18:
 * Variance for accumulator. Validate that the following code, which adds the methods
 * var() and stddev() to Accumulator, computes both the mean and variance of the numbers
 * presented as arguments to addDataValue():
 * <p>
 * public class Accumulator
 * {
 * private double m;
 * private double s;
 * private int N;
 * <p>
 * public void addDataValue(double x){
 * N++;
 * s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
 * m = m + (x - m) / N;
 * }
 * <p>
 * public double mean(){
 * return m;
 * }
 * public double var(){
 * return s / (N - 1);
 * }
 * pubic double stddev(){
 * return Math.sqrt(this.var());
 * }
 * }
 * This implementation is less susceptible to roundoff error than the straightforward
 * implementation based on saving the sum of the squares of the numbers.
 * <p>
 * The Accumulator API shown on the page 93 defines an abstract data type that provides
 * to client the ability to maintain a running average of data values. The implementation
 * is straightforward. It maintains a int instance variable counts the number of data
 * values seen so far and a double instance variable that keeps track of the sum of the
 * values seen so far. To compute the average it divides the sum by the count. Note that
 * the implementation does not save the data values - it could be used for a huge number
 * of them (even on a device that is not capable of holding that many), or a huge number
 * of accumulators could be used on a big system. This performance characteristic is
 * subtle and might be specified in the API, because an implementation that does save the
 * values might cause an application to run out of memory.
 *
 * @See page 92.
 */
public class E1218_VarianceForAccumulator {

    private Accumulator accumulator;

    public E1218_VarianceForAccumulator(){
        accumulator = new Accumulator();
    }

    public void addDataValue(double x){
        accumulator.addDataValue(x);
    }

    public double validateVar() {
        return accumulator.var();
    }

    public double validateMean(){
        return accumulator.mean();
    }

    public double validateStdev() {
        return accumulator.stddev();
    }
}
