package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E133_IntermixedSequenceOfStackOperations;
import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E133_IntermixedSequenceOfStackOperationsTests {

    private E133_IntermixedSequenceOfStackOperations isoso;
    private JavaStack<Integer> stack;

    @Before
    public void setup() {
        isoso = new E133_IntermixedSequenceOfStackOperations();
        stack = isoso.getStack();
    }

    @Test
    public void test_aScenario_validSequence() {
        stack.pushToStack(0);
        stack.pushToStack(1);
        stack.pushToStack(2);
        stack.pushToStack(3);
        stack.pushToStack(4);

        Assert.assertEquals(4, (int) stack.popFromStack());
        Assert.assertEquals(3, (int) stack.popFromStack());
        Assert.assertEquals(2, (int) stack.popFromStack());
        Assert.assertEquals(1, (int) stack.popFromStack());
        Assert.assertEquals(0, (int) stack.popFromStack());

        stack.pushToStack(5);
        stack.pushToStack(6);
        stack.pushToStack(7);
        stack.pushToStack(8);
        stack.pushToStack(9);

        Assert.assertEquals(9, (int) stack.popFromStack());
        Assert.assertEquals(8, (int) stack.popFromStack());
        Assert.assertEquals(7, (int) stack.popFromStack());
        Assert.assertEquals(6, (int) stack.popFromStack());
        Assert.assertEquals(5, (int) stack.popFromStack());

    }

    @Test
    public void test_bScenario_invalidSequence() {
        stack.pushToStack(6);
        stack.pushToStack(4);

        Assert.assertEquals(4, (int) stack.popFromStack());
        Assert.assertEquals(6, (int) stack.popFromStack());
    }

    @Test
    public void test_cScenario_invalidSequence() {
        stack.pushToStack(5);
        stack.pushToStack(2);

        Assert.assertEquals(2, (int) stack.popFromStack());
        Assert.assertEquals(5, (int) stack.popFromStack());
    }

    @Test
    public void test_dScenario_validSequence() {
        stack.pushToStack(0);
        stack.pushToStack(1);
        stack.pushToStack(2);
        stack.pushToStack(3);
        stack.pushToStack(4);

        Assert.assertEquals(4, (int) stack.popFromStack());
        Assert.assertEquals(3, (int) stack.popFromStack());
        Assert.assertEquals(2, (int) stack.popFromStack());
        Assert.assertEquals(1, (int) stack.popFromStack());
        Assert.assertEquals(0, (int) stack.popFromStack());

        stack.pushToStack(9);
        stack.pushToStack(8);
        stack.pushToStack(7);
        stack.pushToStack(6);
        stack.pushToStack(5);

        Assert.assertEquals(5, (int) stack.popFromStack());
        Assert.assertEquals(6, (int) stack.popFromStack());
        Assert.assertEquals(7, (int) stack.popFromStack());
        Assert.assertEquals(8, (int) stack.popFromStack());
        Assert.assertEquals(9, (int) stack.popFromStack());


    }

    @Test
    public void test_eScenario_validSequence() {

        stack.pushToStack(7);
        stack.pushToStack(8);
        stack.pushToStack(9);
        stack.pushToStack(0);

        stack.pushToStack(6);
        stack.pushToStack(5);
        stack.pushToStack(4);
        stack.pushToStack(3);
        stack.pushToStack(2);
        stack.pushToStack(1);

        Assert.assertEquals(1, (int) stack.popFromStack());
        Assert.assertEquals(2, (int) stack.popFromStack());
        Assert.assertEquals(3, (int) stack.popFromStack());
        Assert.assertEquals(4, (int) stack.popFromStack());
        Assert.assertEquals(5, (int) stack.popFromStack());
        Assert.assertEquals(6, (int) stack.popFromStack());

        Assert.assertEquals(9, (int) stack.popFromStack());
        Assert.assertEquals(8, (int) stack.popFromStack());
        Assert.assertEquals(7, (int) stack.popFromStack());
        Assert.assertEquals(0, (int) stack.popFromStack());

    }

    @Test
    public void test_fScenario_invalidSequence() {
        stack.pushToStack(6);
        stack.pushToStack(4);
        stack.pushToStack(0);

        Assert.assertEquals(0, (int) stack.popFromStack());
        Assert.assertEquals(4, (int) stack.popFromStack());
        Assert.assertEquals(6, (int) stack.popFromStack());
    }

    @Test
    public void test_gScenario_invalidSequence() {
        stack.pushToStack(7);
        stack.pushToStack(4);
        stack.pushToStack(1);

        Assert.assertEquals(1, (int) stack.popFromStack());
        Assert.assertEquals(4, (int) stack.popFromStack());
        Assert.assertEquals(7, (int) stack.popFromStack());
    }

    @Test
    public void test_hScenario_validSequence() {

        stack.pushToStack(0);
        stack.pushToStack(9);

        stack.pushToStack(7);
        stack.pushToStack(8);

        stack.pushToStack(5);
        stack.pushToStack(6);

        stack.pushToStack(3);
        stack.pushToStack(4);

        stack.pushToStack(1);
        stack.pushToStack(2);

        Assert.assertEquals(2, (int) stack.popFromStack());
        Assert.assertEquals(1, (int) stack.popFromStack());

        Assert.assertEquals(4, (int) stack.popFromStack());
        Assert.assertEquals(3, (int) stack.popFromStack());

        Assert.assertEquals(6, (int) stack.popFromStack());
        Assert.assertEquals(5, (int) stack.popFromStack());

        Assert.assertEquals(8, (int) stack.popFromStack());
        Assert.assertEquals(7, (int) stack.popFromStack());

        Assert.assertEquals(9, (int) stack.popFromStack());
        Assert.assertEquals(0, (int) stack.popFromStack());
    }
}
