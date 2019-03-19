package book.exercises.E11_basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

/**
 *
 * Exercise 1.1.11:
 * Write a code fragment that prints the contents of a two-dimensional boolean array,
 * using * to represent true and a space to represent false. Include row and column numbers.
 *
 * Exercise 1.1.13:
 * Write a code fragment to pint the transposition (rows and columns changed) of a two-dimensional
 * array with M rows and N columns.
 *
 */
public class E1111_PrintTwoDimensionalBooleanArray {

    int M, N;
    boolean[][] a;

    public E1111_PrintTwoDimensionalBooleanArray() {
        M = 5;
        N = 7;
        a = new boolean[M][N];
//        StdOut.println(a.length);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i + 3 > j) //random case to set some true values
                    a[i][j] = true;
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                String value = a[i][j] ? "*" : " ";
                StdOut.println("rowNum: [" + i + "] colNum: [" + j + "] value: [" + value + "]");
            }
        }
    }

    public void printTranspositionE1113() {
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                String value = a[i][j] ? "*" : " ";
                StdOut.println("rowNum: [" + j + "] colNum: [" + i + "] value: [" + value + "]");
            }
        }
    }
}
