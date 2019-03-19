package book.exercises.E11_basicprogrammingmodel;

/**
 *
 * Exercise 1.1.14:
 * Write a static method lg() that takes an int value N as argument and returns
 * the largest int not larger than the base-2 logarithm of N. Do not use Math.
 *
 */
public class E1114_TheLargestIntNotLargerThanBase2Logarithm {

    private int myPower(int base, int exponent) {
        int c = 1;
        for (int i = 1; i <= exponent; i++) {
            c *= base;
        }
        return c;
    }

    public int lg(int N) {
        int i = 0;
        while (myPower(2, i + 1) <= N) {
            i++;
        }
        return i;
    }
}
