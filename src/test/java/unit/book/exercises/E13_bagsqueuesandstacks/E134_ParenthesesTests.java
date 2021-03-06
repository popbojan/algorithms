package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E134_Parentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E134_ParenthesesTests {

    E134_Parentheses p;

    @Before
    public void setup(){

        p  = new E134_Parentheses();
    }

    @Test
    public void test_parenthesesProperlyBalanced_returnsTrue(){
        Assert.assertTrue(p.parenthesesProperlyBalanced("[[]]"));
    }

    @Test
    public void test_parenthesesProperlyBalanced_wrongInput_returnsFalse(){
        Assert.assertFalse(p.parenthesesProperlyBalanced("]]][[{{[("));
    }
}
