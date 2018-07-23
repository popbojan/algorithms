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

    private int gcd(int p, int q) {
        StdOut.println("p: [" + p + "]  q: [" + q + "]");
        if(q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
