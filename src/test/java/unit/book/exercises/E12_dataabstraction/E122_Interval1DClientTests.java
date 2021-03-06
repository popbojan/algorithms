package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E122_Interval1DClient;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E122_Interval1DClientTests {

    private E122_Interval1DClient i1dc;
    private final int N = 10;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        i1dc = new E122_Interval1DClient();
    }

    @Test
    public void test_readNIntervalsEachDefinedByAPairOfDoubleValues() {

        double[][] arrayWithPairOfDoubleValues = new double[][]{{1.0, 2.2}, {2.7, 12.3}, {4.8, 5.1}, {6.0, 6.1}, {11.9, 10.3}, {10.9, 8.4},
                {3.1, 3.3}, {8.7, 8.5}, {9.1, 6.1}, {7.0, 4.5}, {11.1, 10.0}, {10.7, 10.6}};

        i1dc.printPairsThatIntersect(N, arrayWithPairOfDoubleValues);
    }
}
