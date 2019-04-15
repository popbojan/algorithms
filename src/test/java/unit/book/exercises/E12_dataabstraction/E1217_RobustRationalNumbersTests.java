package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1217_RobustRationalNumbers;
import book.exercises.E12_dataabstraction.helper.Rational;
import book.exercises.E12_dataabstraction.helper.exception.CommonFactorsException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class E1217_RobustRationalNumbersTests {

    E1217_RobustRationalNumbers rrn;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        rrn = new E1217_RobustRationalNumbers();
    }

    @Test
    public void test_createRational() throws CommonFactorsException {
        Rational result = rrn.createRational(7, 2);
        assertNotNull(result);
        assertTrue(result instanceof Rational);
    }

}
