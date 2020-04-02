package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1315_KthItemInQueue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1315_KthItemInQueueTests {

    private E1315_KthItemInQueue kiiq;

    @Before
    public void setup() {
        kiiq = new E1315_KthItemInQueue();
    }

    @Test
    public void test_getKthItem_returnsRightItem() {
        Assert.assertEquals(null, kiiq.getKthItem());
    }
}
