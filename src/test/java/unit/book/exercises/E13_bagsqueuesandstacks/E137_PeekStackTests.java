package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E137_PeekStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E137_PeekStackTests {

    private E137_PeekStack ps;

    @Before
    public void setup(){
        ps = new E137_PeekStack(5);
    }

    @Test
    public void test_peek_returnsMostRecentlyInsertedItem(){
        ps.pushToStack("FIRST");
        ps.pushToStack("SECOND");
        ps.pushToStack("THIRD");
        ps.pushToStack("FORTH");
        ps.pushToStack("FIFTH");

        Assert.assertEquals("FIFTH", ps.peek());
        Assert.assertEquals("FIFTH", ps.popFromStack());
        Assert.assertEquals("FORTH", ps.peek());
        Assert.assertEquals("FORTH", ps.popFromStack());
    }
}
