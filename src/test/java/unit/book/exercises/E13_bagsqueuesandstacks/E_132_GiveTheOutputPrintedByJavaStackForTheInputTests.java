package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E_132_GiveTheOutputPrintedByJavaStackForTheInput;
import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E_132_GiveTheOutputPrintedByJavaStackForTheInputTests {

    private E_132_GiveTheOutputPrintedByJavaStackForTheInput gtopbjsfti;
    private JavaStack<String> stack;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        gtopbjsfti = new E_132_GiveTheOutputPrintedByJavaStackForTheInput();
        stack = gtopbjsfti.getStack();
    }

    @Test
    public void test_output_printsTheRightOutputForGivenInput(){
        stack.pushToStack("it");
        stack.pushToStack("was");
        stack.popFromStack();
        stack.pushToStack("the");
        stack.pushToStack("best");
        stack.popFromStack();
        stack.pushToStack("of");
        stack.pushToStack("times");
        stack.popFromStack();
        stack.popFromStack();
        stack.popFromStack();
        stack.pushToStack("it");
        stack.pushToStack("was");
        stack.popFromStack();
        stack.pushToStack("the");
        stack.popFromStack();
        stack.popFromStack();

        stack.printAllItemsInStack();

        Assert.assertEquals(1, stack.size());
        Assert.assertEquals("it", stack.popFromStack());
    }
}
