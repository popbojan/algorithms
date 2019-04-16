package book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.helper.Rational;
import book.exercises.E12_dataabstraction.helper.exception.CommonFactorsException;

/**
 * Exercise 1.2.16:
 * Rational numbers. Implement an immutable data type Rational for rational numbers
 * that supports addition, subtraction, multiplication and division.
 * <p>
 * public class Rational
 * Rational(int numerator, int denominator)
 * Rational plus(Rational b) sum of this number and b
 * Rational minus(Rational b) difference of this number and b
 * Rational times(Rational b) product of this number and b
 * Rational divides(Rational b) quotient of this number and b
 * boolean equals(Rational that) is this number equal to that?
 * String toString() string representation
 * <p>
 * You do not have to worry about testing for overflow (see EXERCISE 1.2.17), but use as
 * instance variables two long values that represent the numerator and denominator to
 * limit the possibility of overflow. Use Euclid's algorithm (see page 4) to ensure that the
 * numerator and denominator never have any common factors. Include a test client that
 * exercises all of your methods.
 * <p>
 * Exercise 1.2.17:
 * Robust implementation of rational numbers. Use assertions to develop an implementation
 * of Rational (SEE EXERCISE 1.2.16) that is immune to overflow.
 */
public class E1216_ImmutableRationalNumbers {

    public Rational createRational(int numerator, int denominator) throws CommonFactorsException {
        return Rational.getRational(numerator, denominator);
    }

    public Rational plus(Rational r1, Rational r2) {
        return r1.plus(r2);
    }

    public Rational minus(Rational r1, Rational r2) {
        return r1.minus(r2);
    }

    public Rational times(Rational r1, Rational r2) {
        return r1.times(r2);
    }

    public Rational divides(Rational r1, Rational r2) {
        return r1.divides(r2);
    }

    public boolean equals(Rational r1, Rational r2) {
        return r1.equals(r2);
    }
}
