package book.exercises.basicprogrammingmodel._11;

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
