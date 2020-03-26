package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E139_InfixParentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E139_InfixParenthesesTests {

    private E139_InfixParentheses ip;

    @Before
    public void setup(){
        ip = new E139_InfixParentheses();
    }

    @Test
    public void test_infix_returnsRightArithmeticExpression(){
        String output = ip.addLeftParentheses("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )");
        Assert.assertEquals("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )", output);
    }
}
