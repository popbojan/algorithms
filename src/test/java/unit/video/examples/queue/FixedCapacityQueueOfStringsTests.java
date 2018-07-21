package unit.video.examples.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.queue.FixedCapacityQueueOfStrings;

public class FixedCapacityQueueOfStringsTests {

    FixedCapacityQueueOfStrings fcq;

    @Before
    public void setup() {
        fcq = new FixedCapacityQueueOfStrings(10);
    }

    @Test
    public void canBeCreated() {
        FixedCapacityQueueOfStrings fcq = new FixedCapacityQueueOfStrings(10);
    }

    @Test
    public void queue_itemIsAddedToTheSArray() {
        fcq.enqueue("Bojan");
        fcq.enqueue("is");
        fcq.enqueue("the");
        fcq.enqueue("best");
        fcq.enqueue("!!!");

        Assert.assertEquals("Bojan", fcq.dequeue());
        Assert.assertEquals("is", fcq.dequeue());
        Assert.assertEquals("the", fcq.dequeue());
        Assert.assertEquals("best", fcq.dequeue());
        Assert.assertEquals("!!!", fcq.dequeue());
        Assert.assertEquals(null, fcq.dequeue());

        fcq.pirntArray();

        fcq.enqueue("Bojan");
        fcq.pirntArray();
    }
}
