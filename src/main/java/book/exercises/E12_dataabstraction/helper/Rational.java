package book.exercises.E12_dataabstraction.helper;

import book.exercises.E12_dataabstraction.helper.exception.CommonFactorsException;

/**
 * Rational Number can be made by dividing two integers.
 * Rational Number is a number that can be in the form p/q
 * where p and q are integers and q is not equal to zero.
 * <p>
 * Square root of 2 and Pi are irrational, cause they cannot be written
 * as a simple fraction(p/q).
 * <p>
 * Numerator (p) is the top number in a faction. Shows how many parts we have.
 * Denominator (q) is the bottom number and it shows how many equal parts the
 * item is divided into
 */
public class Rational {

    private int numerator;
    private int denominator;

    private Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Rational getRational(int numerator, int denominator) throws CommonFactorsException {
        if (haveCommonFactors(numerator, denominator)) {
            throw new CommonFactorsException("Numerator and denominator can't have any common factors!");
        }
        return new Rational(numerator, denominator);

    }

    private Rational plus(Rational that) {

        // Find gcd of numerators and denominators
        int numeratorCommonFactor = gcd(this.numerator, that.numerator);
        int denominatorCommonFactor = gcd(this.denominator, that.denominator);

        // add cross-product terms for numerator
        int numeratorA = (this.numerator / numeratorCommonFactor) * (that.denominator / denominatorCommonFactor);
        int numeratorB = (that.numerator / numeratorCommonFactor) * (this.denominator / denominatorCommonFactor);

        int resultNumerator = (numeratorA + numeratorB) * numeratorCommonFactor;
        int resultDenominator = (this.denominator * that.denominator) / denominatorCommonFactor;

        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational minus(Rational b) {
        throw new RuntimeException("Not implemented yet");
    }

    public Rational times(Rational b) {
        throw new RuntimeException("Not implemented yet");
    }

    public Rational divides(Rational b) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean equals(Object obj) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public String toString() {
        throw new RuntimeException("Not implemented yet");
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private static boolean haveCommonFactors(int numerator, int denominator) {
        int commonDivisor = gcd(numerator, denominator);
        //System.out.println(commonDivisor);
        return commonDivisor > 1;
    }

    /**
     * Note* When dividend(e.g. 8) is smaller than divisor (e.g.32),
     * then mod is always equal to the dividend, because
     * bigger number cannot be inserted into smaller
     * and get quotient
     * e.g 7-inches screw cannot be inserted into 3-inches metal hole
     */
    private static int gcd(int p, int q) {
        //StdOut.println("p: [" + p + "]  q: [" + q + "]");
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    /**
     * @param p
     * @param q
     * @return leastCommonMultiplier if there is one, if not return -1
     */
    private int leastCommonMultiplier(int p, int q) {
        // swap
        if (p < q) {
            int temp = p;
            p = q;
            q = temp;
        }
        int r = p % q;
        if (r == 0) {
            return p / q;
        } else
            return -1;
    }
}
