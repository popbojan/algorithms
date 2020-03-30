package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1312_CopyIterableStack;
import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;
import org.junit.Before;
import org.junit.Test;

public class E1312_CopyIterableStackTests {

    private E1312_CopyIterableStack cis;
    private JavaStack<String> stack;

    @Before
    public void setup() {
        cis = new E1312_CopyIterableStack();
    }

    @Test
    public void test_copy_returnsSameStack() {
        stack.pushToStack("first");
        stack.pushToStack("second");
        stack.pushToStack("third");
        stack.pushToStack("forth");
        stack.pushToStack("fifth");
        cis.copy(stack);
    }
}
