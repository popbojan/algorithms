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

    public void printChars(){
        StdOut.println('b');
        StdOut.println((char) 'b');
        StdOut.println('b'+'c');
        StdOut.println((char) ('a' +4));
        StdOut.println((char) (4));
        StdOut.println('a' +4);
    }

    public void print1112(){
        int[] a = new int[10];
        for(int i=0; i<a.length; i++){
            a[i] = 9 -i;
            StdOut.println(a[i]);
        }
        for(int i=0; i<a.length; i++){
            a[i] = a[a[i]];
            StdOut.println(a[i]);
        }
        for(int i=0; i<a.length; i++){
            StdOut.println(i);
        }

    }
}
