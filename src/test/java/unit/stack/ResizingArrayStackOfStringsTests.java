package unit.stack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import stack.ResizingArrayStackOfStrings;

public class ResizingArrayStackOfStringsTests {

    ResizingArrayStackOfStrings resizingStack;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        resizingStack = new ResizingArrayStackOfStrings(1);
    }

    @Test
    public void canBeCreated() {
        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings(1);
    }

    @Test
    public void push_ItemsAreLinked() {
        resizingStack.push("!!!");
        resizingStack.push("best");
        resizingStack.push("the");
        resizingStack.push("is");
        resizingStack.push("Bojan");

        resizingStack.printSize();

        while (!resizingStack.isEmpty()) {
            System.out.println(resizingStack.pop());
        }

        resizingStack.printSize();
    }

}
