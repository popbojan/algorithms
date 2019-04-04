package book.exercises.E12_dataabstraction.helper;

import book.exercises.E12_dataabstraction.helper.exception.CommonFactorsException;

/**
 * Rational Number can be made by dividing two integers.
 * Rational Number is a number that can be in the form p/q
 * where p and q are integers and q is not equal to zero.
 *
 * Square root of 2 and Pi are irrational, cause they cannot be written
 * as a simple fraction(p/q).
 *
 * Numerator (p) is the top number in a faction. Shows how many parts we have.
 * Denominator (q) is the bottom number and it shows how many equal parts the
 * item is divided into
 */
public class Rational {

    private int numerator;
    private int denominator;

    private Rational(int numerator, int denominator){
    }

    public static Rational getRational(int numerator, int denominator) throws CommonFactorsException {
        if(haveCommonFactors(numerator, denominator)){
            throw new CommonFactorsException("Numerator and denominator can't have any commom factors!");
        }
        return new Rational(numerator, denominator);

    }

    private static boolean haveCommonFactors(int numerator, int denominator) {
        // TODO: Implement commom factors check
        return false;
    }

    public Rational plus(Rational b) {
        throw new RuntimeException("Not implemented yet");
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
}
