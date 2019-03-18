package book.exercises.E11_basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

/**
 *
 * Exercise 1.1.24:
 * Give the sequence of values of p and q that are computed when Euclid's algorithm
 * is used to compute the greatest common divisor of 105 and 24. Extend the code given
 * on page 4 to develop a program Euclid that takes two integers from the command line
 * and computes their greatest common divisor, printing out the two arguments for each
 * call on the recursive method. Use your program to compute the greatest common divisor
 * or 1111111 and 1234567.
 *
 */
public class E1124_CommonDivisorByEuclid {

    public void commonDivisor() {
        int p = 8;
        int q = 32;
//        p = 1111111;
//        q = 1234567;
        StdOut.println(gcd(p, q));
    }

    public static int getCommonDivisor(int p, int q){
        return gcd(p, q);
    }

    /**
     * Note* When dividend(e.g. 8) is smaller than divisor (e.g.32),
     * then mod is always equal to the dividend, because
     * bigger number cannot be inserted into smaller
     * and get quotient
     * e.g 7-inches screw cannot be inserted into 3-inches metal hole
     */
    private static int gcd(int p, int q) {
        //StdOut.println("p: [" + p + "]  q: [" + q + "]");
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
