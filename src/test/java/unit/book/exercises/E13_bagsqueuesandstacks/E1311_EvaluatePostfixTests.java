package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1311_EvaluatePostfix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1311_EvaluatePostfixTests {

    private E1311_EvaluatePostfix ep;
    final double INCONSIDERABLE_DIFFERENCE = 0.1;

    @Before
    public void setup(){
        ep = new E1311_EvaluatePostfix();
    }

    @Test
    public void test_evaluate(){
        double result = ep.evaluate();
        Assert.assertEquals(100.23, result, INCONSIDERABLE_DIFFERENCE);
    }

}
