package unit.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import queue.LinkedStackOfQueue;

public class LinkedStackOfQueueTests {

    LinkedStackOfQueue lsq;

    @Before
    public void setup() {
        lsq = new LinkedStackOfQueue();
    }

    @Test
    public void canBeCreated() {
        LinkedStackOfQueue lsq = new LinkedStackOfQueue();
    }

    @Test
    public void enqueue_ItemsAreLinked_andFirstAddedFirstComesOut() {
        lsq.enqueue("Bojan");
        lsq.enqueue("is");
        lsq.enqueue("the");
        lsq.enqueue("best");
        lsq.enqueue("!!!");

        Assert.assertEquals("Bojan", lsq.dequeue());
        Assert.assertEquals("is", lsq.dequeue());
        Assert.assertEquals("the", lsq.dequeue());
        Assert.assertEquals("best", lsq.dequeue());
        Assert.assertEquals("!!!", lsq.dequeue());

        while (!lsq.isEmpty()) {
            System.out.println(lsq.dequeue());
        }
    }

}
