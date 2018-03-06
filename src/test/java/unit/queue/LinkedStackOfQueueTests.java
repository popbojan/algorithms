package unit.queue;

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
    public void enqueue_ItemsAreLinked() {
        lsq.enqueue("Bojan");
        lsq.enqueue("is");
        lsq.enqueue("the");
        lsq.enqueue("best");
        lsq.enqueue("!!!");


        while (!lsq.isEmpty()) {
            System.out.println(lsq.dequeue());
        }
    }

}
