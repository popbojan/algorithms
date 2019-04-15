package book.exercises.E12_dataabstraction.helper;

import book.exercises.E12_dataabstraction.helper.exception.CommonFactorsException;

public class RobustRational extends Rational {

    private final static String ASSERT_AVOIDING_OVERFLOW_MESSAGE = "Operation would cause overflow!";

    private RobustRational(int numerator, int denominator) {
        super(numerator, denominator);
    }

    public static RobustRational getRobustRational(int numerator, int denominator) throws CommonFactorsException {
        if (haveCommonFactors(numerator, denominator)) {
            throw new CommonFactorsException("Numerator and denominator can't have any common factors!");
        }
        return new RobustRational(numerator, denominator);
    }

    @Override
    public RobustRational plus(Rational that) {

        // Find gcd of numerators and denominators
        int numeratorCommonFactor = gcd(numerator, that.numerator);
        int denominatorCommonFactor = gcd(this.denominator, that.denominator);

        assert ((this.numerator / numeratorCommonFactor) * (that.denominator / denominatorCommonFactor))
                + ((that.numerator / numeratorCommonFactor) * (this.denominator / denominatorCommonFactor)) <= Integer.MAX_VALUE : ASSERT_AVOIDING_OVERFLOW_MESSAGE;
        assert (this.denominator * that.denominator) / denominatorCommonFactor <= Integer.MAX_VALUE : ASSERT_AVOIDING_OVERFLOW_MESSAGE;

        return (RobustRational) super.plus(that);
    }

    @Override
    public Rational minus(Rational that) {
        return super.minus(that);
    }

    @Override
    public Rational times(Rational that) {
        return super.times(that);
    }

    @Override
    public Rational divides(Rational that) {
        return super.divides(that);
    }
}
