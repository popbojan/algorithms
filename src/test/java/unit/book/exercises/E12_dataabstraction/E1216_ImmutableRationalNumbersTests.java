package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1216_ImmutableRationalNumbers;
import book.exercises.E12_dataabstraction.helper.Rational;
import book.exercises.E12_dataabstraction.helper.exception.CommonFactorsException;
import org.junit.Before;
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

}
