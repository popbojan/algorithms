package unit.video.examples.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.stack.Dijkstra_sTwoStackAlgorithm;

public class Dijkstra_sTwoStackAlgorithmTests {

    Dijkstra_sTwoStackAlgorithm da;

    @Before
    public void setup(){
        da = new Dijkstra_sTwoStackAlgorithm();
    }

    @Test
    public void calculateExpression(){
        Double result = da.calculate("(((2+3)+7)*2)");
        Assert.assertEquals((Double)(24.0), result);
    }

}
