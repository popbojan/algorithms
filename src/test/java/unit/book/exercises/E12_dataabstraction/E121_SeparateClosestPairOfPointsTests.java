package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E121_SeparateClosestPairOfPoints;
import javafx.geometry.Point2D;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class E121_SeparateClosestPairOfPointsTests {

    private E121_SeparateClosestPairOfPoints scpop;
    private final int N = 10;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        scpop = new E121_SeparateClosestPairOfPoints();
    }

    @Test
    public void test_generateRandomPointsInTheUnitSquare() {
        Point2D[] result = scpop.generateRandomPointsInTheUnitSquare(N);
        assertEquals(N, result.length);
        assertTrue(result[2] instanceof Point2D);
    }

    @Test
    public void test_calculateTheDistanceOfPoints() {
        Point2D[] points = scpop.generateRandomPointsInTheUnitSquare(N);
        scpop.calculateTheDistanceOfPoints(points);
    }
}
