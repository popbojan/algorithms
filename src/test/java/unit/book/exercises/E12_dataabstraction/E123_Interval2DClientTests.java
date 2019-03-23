package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E123_Interval2DClient;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E123_Interval2DClientTests {

    private E123_Interval2DClient i2dc;
    private final int N = 10;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        i2dc = new E123_Interval2DClient();
    }

    @Test
    /**
     * run couple of times to get one contained in another
     */
    public void test_printIntervals2DThatIntersectAndThatAreContainedInOneAnother() {

        i2dc.printIntervalsThatIntersectAndThatAreContainedInOneAnother(10, 0.2, 0.67);
    }

}
