package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1120_FactorialRecursion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1120_FactorialRecursionTests {

    E1120_FactorialRecursion fr;

    @Before
    public void setup(){
        fr = new E1120_FactorialRecursion();
    }

    @Test
    public void test_ln(){
        Assert.assertEquals(120, fr.ln(5));
        Assert.assertEquals(5040, fr.ln(7));
    }
}
