package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E121_SeparateClosestPairOfPoints;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E121_SeparateClosestPairOfPointsTests {

    private E121_SeparateClosestPairOfPoints scpop;
    private final int N = 10;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        scpop = new E121_SeparateClosestPairOfPoints();
    }

    @Test
    public void test() {
    }
}
