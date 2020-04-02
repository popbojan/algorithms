package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1315_KthItemInQueue;
import book.exercises.E13_bagsqueuesandstacks.helper.ResizingArrayQueue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1315_KthItemInQueueTests {

    private E1315_KthItemInQueue kiiq;
    private ResizingArrayQueue<String> queue;

    @Before
    public void setup() {
        kiiq = new E1315_KthItemInQueue();
        queue = kiiq.getQueue();
    }

    @Test
    public void test_getKthItem_returnsRightItem() {
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

        Assert.assertEquals("vier", kiiq.getKthItem(4).get());
        Assert.assertEquals("zwölf", kiiq.getKthItem(12).get());
        Assert.assertEquals("eins", kiiq.getKthItem(1).get());
        Assert.assertFalse(kiiq.getKthItem(30).isPresent());
    }
}
