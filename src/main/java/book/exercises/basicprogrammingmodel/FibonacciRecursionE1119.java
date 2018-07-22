package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

public class FibonacciRecursionE1119 {

    private long F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N - 1) + F(N - 2);
    }

    public void print() {
        for (int N = 0; N < 10; N++) {
            StdOut.println(N + " " + F(N));
        }
    }
}
