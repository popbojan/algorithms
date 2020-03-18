package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E_132_GiveTheOutputPrintedByJavaStackForTheInput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E_132_GiveTheOutputPrintedByJavaStackForTheInputTests {

    private E_132_GiveTheOutputPrintedByJavaStackForTheInput gtopbjsfti;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        gtopbjsfti = new E_132_GiveTheOutputPrintedByJavaStackForTheInput();
    }

    @Test
    public void test_output_printsTheRightOutputForGivenInput(){
        gtopbjsfti.pushToStack("it");
        gtopbjsfti.pushToStack("was");
        gtopbjsfti.popFromStack();
        gtopbjsfti.pushToStack("the");
        gtopbjsfti.pushToStack("best");
        gtopbjsfti.popFromStack();
        gtopbjsfti.pushToStack("of");
        gtopbjsfti.pushToStack("times");
        gtopbjsfti.popFromStack();
        gtopbjsfti.popFromStack();
        gtopbjsfti.popFromStack();
        gtopbjsfti.pushToStack("it");
        gtopbjsfti.pushToStack("was");
        gtopbjsfti.popFromStack();
        gtopbjsfti.pushToStack("the");
        gtopbjsfti.popFromStack();
        gtopbjsfti.popFromStack();

        gtopbjsfti.printAllItemsInStack();

        Assert.assertEquals(1, gtopbjsfti.size());
        Assert.assertEquals("it", gtopbjsfti.popFromStack());
    }
}
