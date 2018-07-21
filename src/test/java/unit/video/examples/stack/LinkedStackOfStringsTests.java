package unit.video.examples.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import video.examples.stack.LinkedStackOfStrings;

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

        Assert.assertEquals("Bojan", linkedStack.pop());
        Assert.assertEquals("is", linkedStack.pop());
        Assert.assertEquals("the", linkedStack.pop());
        Assert.assertEquals("best", linkedStack.pop());
        Assert.assertEquals("!!!", linkedStack.pop());

        while (!linkedStack.isEmpty()) {
            System.out.println(linkedStack.pop());
        }
    }
}