package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1320_DeleteKthElement;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1320_DeleteKthElementTests {

    private E1320_DeleteKthElement dke;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        dke = new E1320_DeleteKthElement();
        linkedList = dke.getLinkedList();
    }

    @Test
    public void test_deleteItem_firstItem_deletesFirstItem() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.deleteItem(4);
        linkedList.deleteItem(1);

        Assert.assertEquals(1, linkedList.size());
        Assert.assertEquals("ZWEI", linkedList.dequeue());

        linkedList.enqueue("EINS");
        Assert.assertEquals(1, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
    }

    @Test
    public void test_deleteItem_thirdItem_deletesThirdItem() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.deleteItem(3);

        Assert.assertEquals(3, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("VIER", linkedList.dequeue());

        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");

        Assert.assertEquals(4, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());
        Assert.assertEquals("VIER", linkedList.dequeue());
    }

    @Test
    public void test_deleteItem_lastItem_deletesLastItem() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.deleteItem(4);

        Assert.assertEquals(3, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());
        Assert.assertNull(linkedList.dequeue());

        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");

        Assert.assertEquals(4, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());
    }
}
