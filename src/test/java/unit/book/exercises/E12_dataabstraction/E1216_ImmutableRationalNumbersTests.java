package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1216_ImmutableRationalNumbers;
import book.exercises.E12_dataabstraction.helper.Rational;
import book.exercises.E12_dataabstraction.helper.exception.CommonFactorsException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class E1216_ImmutableRationalNumbersTests {

    E1216_ImmutableRationalNumbers irn;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        irn = new E1216_ImmutableRationalNumbers();
    }

    @Test
    public void test_createRational() throws CommonFactorsException {
        Rational result = irn.createRational(7, 2);
        assertNotNull(result);
        assertTrue(result instanceof Rational);
    }

    @Test
    public void test_createRational_haveCommonFactors_exceptionIsThrown() {
        try {
            irn.createRational(12, 4);
        } catch (CommonFactorsException cfe) {
            assertEquals("Numerator and denominator can't have any common factors!", cfe.getMessage());
        }
    }

    @Test
    public void test_plus() throws CommonFactorsException {
        Rational r1 = irn.createRational(7, 2);
        Rational r2 = irn.createRational(51, 8);
        Rational result = irn.plus(r1, r2);
        assertEquals(79, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    @Ignore // cannot reproduce overflow
    public void test_plus_overflow() throws CommonFactorsException {
        Rational r1 = irn.createRational(1993621333, 1999252172);
        Rational r2 = irn.createRational(1934111111, 1561715333);
        Rational result = irn.plus(r1, r2);
    }

    @Test
    public void test_minus() throws CommonFactorsException {
        Rational r1 = irn.createRational(7, 2);
        Rational r2 = irn.createRational(51, 8);
        Rational result = irn.minus(r1, r2);
        assertEquals(-23, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    public void test_times() throws CommonFactorsException {
        Rational r1 = irn.createRational(7, 2);
        Rational r2 = irn.createRational(51, 8);
        Rational result = irn.times(r1, r2);
        assertEquals(357, result.getNumerator());
        assertEquals(16, result.getDenominator());
    }

    @Test
    @Ignore // cannot reproduce overflow
    public void test_times_overflow() throws CommonFactorsException {
        Rational r1 = irn.createRational(1993621333, 1999252172);
        Rational r2 = irn.createRational(1934111111, 1561715333);
        Rational result = irn.times(r1, r2);
    }

    @Test
    public void test_divides() throws CommonFactorsException {
        Rational r1 = irn.createRational(7, 2);
        Rational r2 = irn.createRational(51, 8);
        Rational result = irn.divides(r1, r2);
        assertEquals(28, result.getNumerator());
        assertEquals(51, result.getDenominator());
    }

    @Test
    public void test_equals() throws CommonFactorsException {
        Rational r1 = irn.createRational(7, 2);
        Rational r2 = irn.createRational(7, 2);
        assertTrue(irn.equals(r1, r2));
    }

    @Test
    public void test_equals_notEqual_returnFalse() throws CommonFactorsException {
        Rational r1 = irn.createRational(7, 2);
        Rational r2 = irn.createRational(51, 8);
        assertFalse(irn.equals(r1, r2));
    }

    @Test
    public void test_toString() throws CommonFactorsException {
        Rational r1 = irn.createRational(7, 2);
        assertEquals("Numerator: [" + 7 + "] Denominator: [" + 2 + "]", r1.toString());
    }

}
