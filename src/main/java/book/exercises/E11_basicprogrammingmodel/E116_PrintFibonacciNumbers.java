package book.exercises.E11_basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

/**
 *
 * Exercise 1.1.6
 * What does the following program print?
 *
 *    int f = 0;
 *    int g = 1;
 *    for (int i = 0; i <= 15; i++)
 *    {
 *        StdOut.println(f)
 *        f = f + g;
 *        g = f - g;
 *    }
 *
 */
public class E116_PrintFibonacciNumbers {

    public void printIt() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            f = f + g;
            g = f - g;
            StdOut.println(f);
        }
    }
}
