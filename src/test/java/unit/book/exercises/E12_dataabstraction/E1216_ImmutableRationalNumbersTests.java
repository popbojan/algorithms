package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1216_ImmutableRationalNumbers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E1216_ImmutableRationalNumbersTests {

    E1216_ImmutableRationalNumbers irn;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        irn = new E1216_ImmutableRationalNumbers();
    }

    @Test
    public void test_plus() {
        irn.plus();
        //assertEquals(6, result[3]);
    }

}
