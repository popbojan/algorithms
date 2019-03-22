package unit.book.exercises.E12_dataabstraction;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E123_Interval2DTests {

    private E123_Interval2DTests i2d;
    private final int N = 10;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        i2d = new E123_Interval2DTests();
    }

    @Test
    public void test_readNIntervalsEachDefinedByAPairOfDoubleValues() {

        i2d.something();
    }

}
