package unit.video.examples.stack;

import video.examples.model.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import video.examples.stack.FixedCapacityStack;
import video.examples.stack.FixedCapacityStackOfStrings;

public class FixedCapacityStackTests {

    FixedCapacityStack<Rectangle> fixedStack;
    Rectangle smallRectangle;
    Rectangle wierdRectangle;
    Rectangle someRectangle;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        fixedStack = new FixedCapacityStack(10);
        smallRectangle = new Rectangle();
        wierdRectangle = new Rectangle();
        someRectangle = new Rectangle();
    }

    @Test
    public void canBeCreated() {
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(5);
    }

    @Test
    public void push_ItemsAreLinked() {
        fixedStack.push(smallRectangle);
        fixedStack.push(wierdRectangle);
        fixedStack.push(someRectangle);

        Assert.assertEquals(someRectangle, fixedStack.pop());
        Assert.assertEquals(wierdRectangle, fixedStack.pop());
        Assert.assertEquals(smallRectangle, fixedStack.pop());

        while (!fixedStack.isEmpty()) {
            System.out.println(fixedStack.pop());
        }
    }
}