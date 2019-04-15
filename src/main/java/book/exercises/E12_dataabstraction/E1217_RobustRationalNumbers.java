package book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.helper.Rational;
import book.exercises.E12_dataabstraction.helper.exception.CommonFactorsException;

/**
 * Exercise 1.2.17:
 * Robust implementation of rational numbers. Use assertions to develop an implementation
 * of Rational (SEE EXERCISE 1.2.16) that is immune to overflow.
 */
public class E1217_RobustRationalNumbers {

    public Rational createRational(int numerator, int denominator) throws CommonFactorsException {
        return Rational.getRational(numerator, denominator);
    }
}
