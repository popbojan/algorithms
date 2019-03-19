package book.exercises.E11_basicprogrammingmodel;

import edu.princeton.cs.introcs.StdOut;

/**
 * Exercise: 1.1.7:
 * Give the value printed by each of the following code fragments:
 *
 * a.
 *    double t = 9.0
 *    while (Math.abs(t - 9.0/t) > .001)
 *        t = (9.0/t + t) / 2.0;
 *    StdOut.printf("%.5f\n", t);
 *
 * b.
 *    int sum = 0;
 *    for (int i = 1; i < 1000; i++)
 *        for (int j = 0; j < i; j++)
 *            sum++;
 *    StdOut.println(sum);
 *
 * c.
 *    int sum = 0;
 *    for (int i = 1; i < 1000; i *= 2) {
 *        for (int j = 0; j < 1000; j++) {
 *            sum++;
 *    StdOut.println(sum);
 *
 * Exercise 1.1.8:
 * What do each of the following print?
 *
 * a.
 *    System.out.println('b');
 * b.
 *    System.out.println('b' + 'c');
 * c.
 *    System.out.println((char) ('a' + 4));
 *
 * Exercise 1.1.12:
 * What does the following code fragment print?
 *
 *    int[] a = new int[10];
 *    for (int i = 0; i < 10; i++)
 *        a[i] = 9 - i;
 *    for (int i = 0; i < 10; i++) {
 *        a[i] = a[a[i]];
 *    for (int i = 0; i < 10; i++) {
 *        System.out.println(i);
 *
 * Exercise 1.1.16:
 * Give the value of exR1(6):
 *
 *    public static String exR1(int n) {
 *        if (n <= 0) return "";
 *    return exR1(n - 3) + n + exR1(n - 2) + n;
 *
 * Exercise 1.1.17:
 * Criticize the following recursive function:
 *
 *    public static String exR2(int n)
 *    {
 *        String s = exR2(n-3) + n + exR2(n-2) + n;
 *        if (n <= 0) return "";
 *        return s;
 *    }
 *
 * Answer: The base case will never be reached. A call to exR2(3) will result in calls to
 * exR2(2), exR2(-3), exR3(-6) and so forth until a StackOverFlowError occurs.
 *
 * Exercise 1.1.18:
 * Consider the following recursive function:
 *
 *    public static int mystery(int a, int b)
 *    {
 *        if(b == 0) return 0;
 *        if(b % 2 == 0) return mystery(a+a, b/2);
 *        return mystery(a+a, b/2) + a;
 *    }
 *
 * What are the values of mystery(2, 25) and mystery(3, 11)? Given the positive integers a
 * and b, describe what value mystery(a, b) computes. Answer the sam question, but replace
 * + with * and replace return 0 with return 1.
 *
 */
public class E117_PrintValues {

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
