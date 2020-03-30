package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1311_EvaluatePostfix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1311_EvaluatePostfixTests {

    private E1311_EvaluatePostfix ep;
    final double INCONSIDERABLE_DIFFERENCE = 0.1;

    @Before
    public void setup() {
        ep = new E1311_EvaluatePostfix();
    }

    @Test
    public void test_evaluate_returnsRightNumber() {
        double result = ep.evaluate("1 2 3 * +");
        Assert.assertEquals(7, result, INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_evaluate_anotherExpression_returnsRightNumber() {
        double result = ep.evaluate("1 2 * 3 4 * +");
        Assert.assertEquals(14, result, INCONSIDERABLE_DIFFERENCE);
    }

}
