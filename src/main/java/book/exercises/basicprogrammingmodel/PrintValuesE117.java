package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

public class PrintValuesE117 {

    public void printA() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        StdOut.printf("%.7f\n", t);
    }

    /**
     * it sums up all the numbers form 1 to 10-1
     * (because array starts with index 1)
     * e.g 1+2+3+4+5+6+7+8+9
     */
    public void printB() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    public void printC() {
        int sum = 0;
        for (int i = 1; i < 5; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    public void printChars() {
        StdOut.println('b');
        StdOut.println((char) 'b');
        StdOut.println('b' + 'c');
        StdOut.println((char) ('a' + 4));
        StdOut.println((char) (4));
        StdOut.println('a' + 4);
    }

    public void print1112() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 9 - i;
            StdOut.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = a[a[i]];
            StdOut.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            StdOut.println(i);
        }

    }

    public void print1116() {
        int n = 6;
        StdOut.println(exR1(n));
    }

    private String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        //return exR1(n-3);
        //return exR1(n-3) + n;

        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public void print1117() {
        int n = 6;
        StdOut.println(exR2(n));
    }

    /**
     * infinite loop
     * recursive calls are executed
     * without ever hitting return statement
     */
    private String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) {
            return "";
        }
        return s;
    }

    public void print1118() {
        StdOut.println(mystery(2, 25));
        StdOut.println(mystery(3, 11));
    }

    /**
     * result value is +a, in last return,
     * from a mystery argument in turn
     * before another recursively mystery() is called
     * e.g 2 + 16 + 32 = 50
     * e.g 3 +  6 + 24 = 33
     */
    private int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a;
    }
}
