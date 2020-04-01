package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1314_ResizingArrayQueue;
import book.exercises.E13_bagsqueuesandstacks.helper.ResizingArrayQueue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1314_ResizingArrayQueueTests {

    private E1314_ResizingArrayQueue<String> raq;
    private ResizingArrayQueue<String> queue;

    @Before
    public void setup() {
        raq = new E1314_ResizingArrayQueue();
        queue = new ResizingArrayQueue<>();
    }

    @Test
    public void test_queue_doesEnqueueDequeueProperly() {
        queue.enqueue("eins");
        queue.enqueue("zwei");
        queue.enqueue("drei");
        queue.enqueue("vier");
        queue.enqueue("fünf");
        queue.enqueue("sechs");
        queue.enqueue("sieben");
        queue.enqueue("acht");
        queue.enqueue("neun");
        queue.enqueue("zehn");
        queue.enqueue("elf");
        queue.enqueue("zwölf");

        Assert.assertEquals(12, queue.size());
        Assert.assertEquals("eins", queue.dequeue());
        Assert.assertEquals("zwei", queue.dequeue());
        Assert.assertEquals("drei", queue.dequeue());
        Assert.assertEquals("vier", queue.dequeue());
        Assert.assertEquals("fünf", queue.dequeue());
        Assert.assertEquals("sechs", queue.dequeue());
        Assert.assertEquals("sieben", queue.dequeue());
        Assert.assertEquals("acht", queue.dequeue());
        Assert.assertEquals(4, queue.size());
    }

    @Test
    public void test_queue_doesArrayResizeProperly() {
        queue.enqueue("eins");
        queue.enqueue("zwei");
        queue.enqueue("drei");
        queue.enqueue("vier");
        queue.enqueue("fünf");

        Assert.assertEquals(5, queue.size());
        Assert.assertEquals(8, queue.arraySize());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        Assert.assertEquals(1, queue.size());
        Assert.assertEquals(4, queue.arraySize());
    }

    @Test
    public void test_dequeue_moreThanEnqueued_doesntExplode() {
        queue.enqueue("eins");
        queue.enqueue("zwei");
        queue.enqueue("drei");
        queue.enqueue("vier");
        queue.enqueue("fünf");

        Assert.assertEquals("eins", queue.dequeue());
        Assert.assertEquals("zwei", queue.dequeue());
        Assert.assertEquals("drei", queue.dequeue());
        Assert.assertEquals("vier", queue.dequeue());
        Assert.assertEquals("fünf", queue.dequeue());
        Assert.assertEquals(null, queue.dequeue());
        Assert.assertEquals(null, queue.dequeue());
    }
}