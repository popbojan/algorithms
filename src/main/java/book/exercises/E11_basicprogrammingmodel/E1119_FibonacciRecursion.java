package book.exercises.E11_basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

/**
 *
 * Exercise 1.1.19:
 * Run the following program on your computer:
 *
 * public class Fibonacci
 * {
 *     public static long F(int N)
 *     {
 *         if (N == 0) return 0;
 *         if (N == 1) return 1;
 *         return F(N-1) + F(N-2);
 *     }
 *
 *     public static void main(String[] args)
 *     {
 *         for (int N = 0; N < 100; N++)
 *             StdOut.println(N + " " + F(N));
 *     }
 * }
 *
 * What is the largest value of N for which this program takes less 1 hour to compute the
 * value of F(N)? Develop a better implementation of F(N) that saves computed values in an array.
 *
 *
 *
 * result
 * 0 0
 * 1 1
 * 2 1
 * 3 2
 * 4 3
 * 5 5
 * 6 8
 * 7 13
 * 8 21
 * 9 34
 * <p>
 * What is the secret?
 * The thing is that each recursion (N-1) has it's own subtraction to 1 or 0
 * however each of these steps has also recursion with (N-2) before 1 or 0 is reached
 * For instance when N =5 we have:
 * F(5-1) + F(5-2) then
 * F(4-1) + F(4-2) then
 * F(3-1) + F(3-2) then
 * F(2-1) + F(2-2) then
 * F(2-1) returns 1 then
 * F(2-2) returns 0 then
 * F(3-2) returns 1 then
 * F(4-2) computes:
 * F(2-1) + F(2-2) then
 * F(2-1) returns 1 then
 * F(2-2) returns 0 then
 * F(5-2) computes:
 * F(3-1) + F(3-2) then
 * F(2-1) + F(2-2) then
 * F(2-1) returns 1 then
 * F(2-2) returns 0 then
 * F(3-2) computes:
 * F(3-2) returns 1
 */
public class E1119_FibonacciRecursion {
    private final int LENGTH = 100;

    private long[] savedComputations;

    public E1119_FibonacciRecursion() {
        savedComputations = new long[LENGTH];
    }

    private long getF(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return getF(N - 1) + getF(N - 2);
    }

    private long getImprovedF(int N) {
        if (savedComputations[N] != 0) {
            return savedComputations[N];
        }
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return getImprovedF(N - 1) + getImprovedF(N - 2);
    }

    public void print() {
        for (int N = 0; N < LENGTH; N++) {
            StdOut.println(N + " " + getF(N));
        }
    }

    public void calculateFibonacciNumbersForGivenLength() {
        for (int N = 0; N < LENGTH; N++) {
            long fibonacciNumber = getImprovedF(N);
            savedComputations[N] = fibonacciNumber;
            StdOut.println(N + " " + fibonacciNumber);
        }
    }
}
