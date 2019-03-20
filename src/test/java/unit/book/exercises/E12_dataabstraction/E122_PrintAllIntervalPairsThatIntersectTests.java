package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E122_PrintAllIntervalPairsThatIntersect;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Array;

public class E122_PrintAllIntervalPairsThatIntersectTests {

    private E122_PrintAllIntervalPairsThatIntersect paipti;
    private final int N = 10;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        paipti = new E122_PrintAllIntervalPairsThatIntersect();
    }

    @Test
    public void test_readNIntervalsEachDefinedByAPairOfDoubleValues() {

        double[][] arrayWithPairOfDoubleValues = new double[][]{{1.0, 2.2}, {2.7, 12.3}, {4.8, 5.1}, {6.0, 6.1}, {11.9, 10.3}, {10.9, 8.4}};

        paipti.printPairsThatIntersect(N);
    }
}
