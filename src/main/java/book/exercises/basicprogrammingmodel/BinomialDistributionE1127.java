package book.exercises.basicprogrammingmodel;

/**
 * A binomial coefficient C(n, k) gives the number of ways, disregarding order,
 * that k object can be chosen from among n objects;
 * more formally,
 * the number of k-element subsets (or k-combinations) of an n-element set
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
public class BinomialDistributionE1127 {

    int counter = 0;

    public void numberOfRecursiveCalls() {
        int N = 10;
        int k = 6;
        double p = 0.5;

        System.out.println("Result " + binomial(N, k, p));
    }

    /**
     * @param N (number of trials)
     * @param k (number of successful outcomes)
     * @param p probability of getting success (50% chance to get head when tossing a coin)
     * @return
     */
    private double binomial(int N, int k, double p) {
        // apply provided above formula
        return binomialCoefficient(N, k) * Math.pow(p, k) * Math.pow(1-p, N-k);
    }

    /**
     * Combination calculator
     *
     * @param N (number of trials)
     * @param k (number of successful outcomes)
     * @return int
     */
    private int binomialCoefficient(int N, int k) {
        if ((k == 0) || (k == N)) {
            return 1;
        }
        return binomialCoefficient(N - 1, k) + binomialCoefficient(N - 1, k - 1);
    }
}
