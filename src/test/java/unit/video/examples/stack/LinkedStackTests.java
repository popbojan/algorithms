package unit.video.examples.stack;

import video.examples.model.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import video.examples.stack.LinkedStack;
import video.examples.stack.LinkedStackOfStrings;

public class LinkedStackTests {

    LinkedStack<Rectangle> linkedStack;
    Rectangle smallRectangle;
    Rectangle wierdRectangle;
    Rectangle someRectangle;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        linkedStack = new LinkedStack();
        smallRectangle = new Rectangle();
        wierdRectangle = new Rectangle();
        someRectangle = new Rectangle();
    }

    @Test
    public void canBeCreated() {
        LinkedStack<Rectangle> linkedStack = new LinkedStack();
    }

    @Test
    public void push_ItemsAreLinked() {

        linkedStack.push(smallRectangle);
        linkedStack.push(wierdRectangle);
        linkedStack.push(someRectangle);

        Assert.assertEquals(someRectangle, linkedStack.pop());
        Assert.assertEquals(wierdRectangle, linkedStack.pop());
        Assert.assertEquals(smallRectangle, linkedStack.pop());

        while (!linkedStack.isEmpty()) {
            System.out.println(linkedStack.pop());
        }
    }
}