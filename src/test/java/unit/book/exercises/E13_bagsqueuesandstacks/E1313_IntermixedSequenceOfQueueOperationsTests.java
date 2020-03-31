package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1313_IntermixedSequenceOfQueueOperations;
import book.exercises.E13_bagsqueuesandstacks.helper.MyQueue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1313_IntermixedSequenceOfQueueOperationsTests {

    private E1313_IntermixedSequenceOfQueueOperations isoqo;
    private MyQueue<Integer> queue;

    @Before
    public void setup() {
        isoqo = new E1313_IntermixedSequenceOfQueueOperations();
        queue = isoqo.getQueue();
    }

    @Test
    public void test_aScenario_validSequence() {
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);

        Assert.assertEquals(0, (int) queue.dequeue());
        Assert.assertEquals(1, (int) queue.dequeue());
        Assert.assertEquals(2, (int) queue.dequeue());
        Assert.assertEquals(3, (int) queue.dequeue());
        Assert.assertEquals(4, (int) queue.dequeue());
        Assert.assertEquals(5, (int) queue.dequeue());
        Assert.assertEquals(6, (int) queue.dequeue());
        Assert.assertEquals(7, (int) queue.dequeue());
        Assert.assertEquals(8, (int) queue.dequeue());
        Assert.assertEquals(9, (int) queue.dequeue());
    }

    @Test
    public void test_bScenario_invalidSequence() {
        queue.enqueue(4);
        queue.enqueue(6);

        Assert.assertEquals(4, (int) queue.dequeue());
        int next = queue.dequeue();
        Assert.assertNotEquals(5, next);
        Assert.assertNotEquals(3, next);
    }

    @Test
    public void test_cScenario_invalidSequence() {
        queue.enqueue(2);
        queue.enqueue(5);

        Assert.assertEquals(2, (int) queue.dequeue());
        int next = queue.dequeue();
        Assert.assertNotEquals(3, next);
        Assert.assertNotEquals(1, next);

    }

    @Test
    public void test_dScenario_validSequence() {
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(0);

        Assert.assertEquals(4, (int) queue.dequeue());
        Assert.assertEquals(3, (int) queue.dequeue());
        Assert.assertEquals(2, (int) queue.dequeue());
        Assert.assertEquals(1, (int) queue.dequeue());
        Assert.assertEquals(0, (int) queue.dequeue());

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);

        Assert.assertEquals(5, (int) queue.dequeue());
        Assert.assertEquals(6, (int) queue.dequeue());
        Assert.assertEquals(7, (int) queue.dequeue());
        Assert.assertEquals(8, (int) queue.dequeue());
        Assert.assertEquals(9, (int) queue.dequeue());

    }
}
