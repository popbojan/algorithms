package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E138_GiveContentsAndSizeOfDoublingStackOfStrings;
import book.exercises.E13_bagsqueuesandstacks.helper.DoublingStackOfStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E138_GiveContentsAndSizeOfDoublingStackOfStringsTests {

    private E138_GiveContentsAndSizeOfDoublingStackOfStrings gcasodsos;
    private DoublingStackOfStrings stack;

    @Before
    public void setup(){
        gcasodsos = new E138_GiveContentsAndSizeOfDoublingStackOfStrings(5);
        stack = gcasodsos.getStack();
    }

    @Test
    public void test_contentAndSize_returnsExpected(){
        stack.push("it");
        stack.push("was");
        stack.pop();
        stack.push("the");
        stack.push("best");
        stack.pop();
        stack.push("of");
        stack.push("times");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("it");
        stack.push("was");
        stack.pop();
        stack.push("the");
        stack.pop();
        stack.pop();

        stack.printAllItemsInStack();

        Assert.assertEquals(false, stack.isEmpty());
        Assert.assertEquals(1, stack.size());
        Assert.assertEquals("it", stack.pop());
        Assert.assertEquals(true, stack.isEmpty());
    }
}
