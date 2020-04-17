package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1324_RemoveAfter;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1324_RemoveAfterTests {

    private E1324_RemoveAfter ra;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        ra = new E1324_RemoveAfter();
        linkedList = ra.getLinkedList();
    }

    @Test
    public void test_removeAfter_removesNodeAfterParticularItem() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.removeAfter("DREI");

        Assert.assertEquals(4, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());
        Assert.assertEquals("FÜNF", linkedList.dequeue());

        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        Assert.assertEquals(5, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());
        Assert.assertEquals("VIER", linkedList.dequeue());
        Assert.assertEquals("FÜNF", linkedList.dequeue());
    }

    @Test
    public void test_removeAfter_itemDoesNotExists_doesNothing() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.removeAfter("SECHS");

        Assert.assertEquals(5, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());
        Assert.assertEquals("VIER", linkedList.dequeue());
        Assert.assertEquals("FÜNF", linkedList.dequeue());
    }
}
