package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

public class CommonDivisorByEuclidE1123 {

    public void commonDivisor() {
        int p = 8;
        int q = 32;
//        p = 1111111;
//        q = 1234567;
        StdOut.println(gcd(p, q));
    }

    /**
     * Note* When dividend(e.g. 8) is smaller than divisor (e.g.32),
     * then mod is always equal to the dividend, because
     * bigger number cannot be inserted into smaller
     * and get quotient
     * e.g 7-inches screw cannot be inserted into 3-inches metal hole
     */
    private int gcd(int p, int q) {
        StdOut.println("p: [" + p + "]  q: [" + q + "]");
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
