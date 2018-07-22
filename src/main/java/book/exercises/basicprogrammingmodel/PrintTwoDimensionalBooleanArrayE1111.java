package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

public class PrintTwoDimensionalBooleanArrayE1111 {

    int M, N;
    boolean[][] a;

    public PrintTwoDimensionalBooleanArrayE1111() {
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
