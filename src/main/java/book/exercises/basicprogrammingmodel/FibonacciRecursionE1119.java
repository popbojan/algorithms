package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

/**
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
 *
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
 *
 *
 */
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
