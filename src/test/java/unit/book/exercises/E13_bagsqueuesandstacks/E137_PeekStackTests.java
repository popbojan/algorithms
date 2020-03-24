package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E137_PeekStack;
import org.junit.Before;
import org.junit.Test;

public class E137_PeekStackTests {

    private E137_PeekStack ps;

    @Before
    public void setup(){
        ps = new E137_PeekStack();
    }

    @Test
    public void test_peek_returnsMostRecentlyInsertedItem(){
        ps.peek();
    }
}
