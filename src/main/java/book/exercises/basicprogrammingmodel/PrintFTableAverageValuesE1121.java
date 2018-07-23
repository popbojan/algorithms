package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

public class PrintFTableAverageValuesE1121 {

    public void printF(TableRowObjectE1121[] a) {
        StdOut.printf("name: " + " A: " + " B: " + " Average: \n");

        for (int i = 0; i < a.length; i++) {
            double average = (double) a[i].getA() / a[i].getB();

            //StdOut.printf("name: " + a[i].getName() + " A: " + a[i].getA() + " B: " + a[i].getB() + " Average: " + "%.3f\n", average);
            StdOut.printf(a[i].getName() + " " + a[i].getA() + " " + a[i].getB() + " " + "%.3f\n", average);

        }
    }
}
