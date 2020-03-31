package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1312_CopyIterableStack;
import book.exercises.E13_bagsqueuesandstacks.helper.ResizingArrayStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1312_CopyIterableStackTests {

    private E1312_CopyIterableStack<String> cisos;
    private E1312_CopyIterableStack<Integer> cisoi;
    private ResizingArrayStack<String> stack;
    private ResizingArrayStack<Integer> stackOfIntegers;

    @Before
    public void setup() {
        cisos = new E1312_CopyIterableStack();
        cisoi = new E1312_CopyIterableStack<>();
        stack = new ResizingArrayStack<>();
        stackOfIntegers = new ResizingArrayStack<>();
    }

    @Test
    public void test_copy_returnsSameStack() {
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("forth");
        stack.push("fifth");
        ResizingArrayStack<String> copy = cisos.copy(stack);
        Assert.assertEquals(copy.size(), stack.size());
        Assert.assertEquals(copy.pop(), stack.pop());
        Assert.assertEquals(copy.pop(), stack.pop());
        Assert.assertEquals(copy.pop(), stack.pop());
        Assert.assertEquals(copy.pop(), stack.pop());
        Assert.assertEquals(copy.pop(), stack.pop());
    }

    @Test
    public void test_copyIntegers_returnsSameStack() {
        stackOfIntegers.push(1);
        stackOfIntegers.push(2);
        stackOfIntegers.push(3);
        stackOfIntegers.push(4);
        stackOfIntegers.push(5);
        ResizingArrayStack<Integer> copy = cisoi.copy(stackOfIntegers);
        Assert.assertEquals(copy.size(), stackOfIntegers.size());
        Assert.assertEquals(copy.pop(), stackOfIntegers.pop());
        Assert.assertEquals(copy.pop(), stackOfIntegers.pop());
        Assert.assertEquals(copy.pop(), stackOfIntegers.pop());
        Assert.assertEquals(copy.pop(), stackOfIntegers.pop());
        Assert.assertEquals(copy.pop(), stackOfIntegers.pop());
    }
}
