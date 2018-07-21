package unit.video.examples.stack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import video.examples.stack.FixedCapacityStackOfStrings;

public class FixedCapacityStackOfStringsTests {

    FixedCapacityStackOfStrings fixedStack;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        fixedStack = new FixedCapacityStackOfStrings(10);
    }

    @Test
    public void canBeCreated() {
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(5);
    }

    @Test
    public void push_ItemsAreLinked() {
        fixedStack.push("!!!");
        fixedStack.push("best");
        fixedStack.push("the");
        fixedStack.push("is");
        fixedStack.push("Bojan");

        while (!fixedStack.isEmpty()) {
            System.out.println(fixedStack.pop());
        }
    }
}
