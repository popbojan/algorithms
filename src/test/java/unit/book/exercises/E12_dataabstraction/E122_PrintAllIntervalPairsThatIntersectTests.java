package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E122_PrintAllIntervalPairsThatIntersect;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E122_PrintAllIntervalPairsThatIntersectTests {

    private E122_PrintAllIntervalPairsThatIntersect paipti;
    private final int N = 10;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        paipti = new E122_PrintAllIntervalPairsThatIntersect();
    }

    @Test
    public void test_generateRandomPointsInTheUnitSquare() {
        paipti.printPairsThatIntersect(N);
    }
}
