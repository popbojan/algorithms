package book.exercises.E11_basicprogrammingmodel;

/**
 *
 * Exercise 1.1.30:
 * Binomial distribution. Estimate the number of recursive calls that would be used by the code:
 *
 *  public static double binomial(int N, int k, double p)
 *  {
 *      if ((N == 0) || (k < 0)) return 1.0;
 *      return (1.0 - p) * binomial (N-1, k) + p * binomial * (N - 1, k - 1);
 *  }
 *
 * to compute binomial(100, 50). Develop a better implementation that is based on saving computed
 * values in an array.
 *
 * A binomial coefficient C(n, k) gives the number of ways, disregarding order,
 * that k object can be chosen from among n objects;
 * more formally,
 * the number of k-element subsets (or k-combinations) of an n-element set
 * its formula for calculation is: n! / k!(n-k)!
 *
 * <p>
 * A Binomial Distribution can be thought of as simply the probability of a
 * SUCCESS or FAILURE outcome in an experiment or survey that is repeated multiple
 * times. The binomial is a type of distribution that has two possible outcomes
 * (the prefix "bi" means two or twice). For example, a coin toss has only two
 * possible outcomes: heads or tails and taking a test could have two possible
 * outcomes: pass or fail.
 * </p>
 * <p>
 * N => number of trials
 * p => probability of success (50% chance to get head when tossing a coin)
 * p = 0.5;    1 - p = 0.5;
 * Formula:
 * b(x, n, P) = nCx * p^x * (1-p)^n-x
 * Binomial Distribution formula uses combination-coefficient formula (nCx) = C(n, x)
 * </p>
 */
public class E1127_BinomialDistribution {

    int counter = 0;

    public void numberOfRecursiveCalls() {
        int N = 108;
        int k = 6;
        double p = 0.5;

        System.out.println("Result " + getBinomialPercentage(N, k, p));
    }

    /**
     * @param N (number of trials)
     * @param k (number of successful outcomes)
     * @param p probability of getting success (50% chance to get head when tossing a coin)
     * @return
     */
    public static double getBinomialPercentage(int N, int k, double p) {
        // apply above provided formula
        return getBinomialCoefficientA(N, k) * Math.pow(p, k) * Math.pow(1 - p, N - k);
    }

    /**
     * Combination calculator
     *
     * @param N (number of trials)
     * @param k (number of successful outcomes)
     * @return formula n! / k!(n-k)!
     */
    private int getBinomialCoefficientR(int N, int k) {
        if ((k == 0) || (k == N)) {
            return 1;
        }
        return getBinomialCoefficientR(N - 1, k) + getBinomialCoefficientR(N - 1, k - 1);
    }

    /**
     * iteration over recursion
     * return formula n! / k!(n-k)!
     */
    public static double getBinomialCoefficientA(int N, int k) {
        double[][] b = new double[N + 1][k + 1];

        //base formula
        for (int i = 0; i <= N; i++) {
            b[i][0] = 1.0;
        }
        b[0][0] = 1.0;

        /** recursive formula
         * it is the same as recursion b(N - 1, k) + b(N - 1, k - 1);
         * and 1 is returned for b[i][0] like above
         * if ((k == 0) || (k == N)) {
         *            return 1;
         *        }
         * however we save each calculation to two-dimensional array
         * that's why it works a lot faster than recursion
         */
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= k; j++) {
                b[i][j] = b[i - 1][j] + b[i - 1][j - 1];
            }
        }
        return b[N][k];
    }
}
