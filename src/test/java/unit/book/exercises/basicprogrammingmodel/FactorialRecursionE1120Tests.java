package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.FactorialRecursionE1120;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialRecursionE1120Tests {

    FactorialRecursionE1120 fr;

    @Before
    public void setup(){
        fr = new FactorialRecursionE1120();
    }

    @Test
    public void test_ln(){
        Assert.assertEquals(120, fr.ln(5));
        Assert.assertEquals(5040, fr.ln(7));
    }
}
