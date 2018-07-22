package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

public class PrintTwoDimensionalBooleanArrayE1111 {

    public void printArray() {
        int M = 5;
        int N = 7;
        boolean[][] a;
        a = new boolean[M][N];
//        StdOut.println(a.length);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i + 3 > j) //random case to set some true values
                    a[i][j] = true;
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                String value = a[i][j] ? "*" : " ";
                StdOut.println("rowNum: [" + i + "] colNum: [" + j + "] value: [" + value + "]");
            }
        }
    }
}
