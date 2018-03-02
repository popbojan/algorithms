package unit.stack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import stack.LinkedStackOfStrings;

public class LinkedStackOfStringsTests {

    LinkedStackOfStrings linkedStack;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        linkedStack = new LinkedStackOfStrings();
    }

    @Test
    public void canBeCreated() {
        LinkedStackOfStrings linkedStack = new LinkedStackOfStrings();
    }

    @Test
    public void push_ItemsAreLinked() {
        linkedStack.push("!!!");
        linkedStack.push("best");
        linkedStack.push("the");
        linkedStack.push("is");
        linkedStack.push("Bojan");

        while (!linkedStack.isEmpty()) {
            System.out.println(linkedStack.pop());
        }
    }
}