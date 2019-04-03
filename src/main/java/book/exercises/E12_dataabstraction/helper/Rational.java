package book.exercises.E12_dataabstraction.helper;

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

    Rational(int numerator, int denominator) {
        //TODO:
        // make constructor private and the static method which checks common factors and
        // that can get instance of this object
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
