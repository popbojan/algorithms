package book.exercises.E11_basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

/**
 *
 * Exercise 1.1.21:
 * Write a program that reads in lines from standard input with each line containing
 * a name and two integers and then uses printf() to print a table with a column of
 * the names, the integers, and the result of dividing the first by the second, accurate
 * to three decimal places. You could use a program like this to tabulate batting averages
 * for baseball players or grades for students.
 *
 */
public class E1121_PrintFTableAverageValues {

    public void printF(E1121_TableRowObject[] a) {
        StdOut.printf("name: " + " A: " + " B: " + " Average: \n");

        for (int i = 0; i < a.length; i++) {
            double average = (double) a[i].getA() / a[i].getB();

            //StdOut.printf("name: " + a[i].getName() + " A: " + a[i].getA() + " B: " + a[i].getB() + " Average: " + "%.3f\n", average);
            StdOut.printf(a[i].getName() + " " + a[i].getA() + " " + a[i].getB() + " " + "%.3f\n", average);

        }
    }
}
