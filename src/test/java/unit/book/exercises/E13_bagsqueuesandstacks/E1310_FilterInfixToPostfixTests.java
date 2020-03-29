package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1310_FilterInfixToPostfix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1310_FilterInfixToPostfixTests {

    private E1310_FilterInfixToPostfix fitp;

    @Before
    public void setup() {
        fitp = new E1310_FilterInfixToPostfix();
    }

    @Test
    public void test_infixToPostfix_returnsPostfix() {
        String output = fitp.infixToPostfix("( ( 1 + 2 ) * ( 4 / 2 ) )");
        Assert.assertEquals("1 2 + 4 2 / *", output);
    }

    @Test
    public void test_infixToPostfix_anotherExample_returnsPostfix() {
        String output = fitp.infixToPostfix("( ( A + B ) * ( C + D ) )");
        Assert.assertEquals("A B + C D + *", output);
    }


}