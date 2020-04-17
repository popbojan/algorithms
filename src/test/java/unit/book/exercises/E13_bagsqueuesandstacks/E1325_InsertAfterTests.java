package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1325_InsertAfter;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1325_InsertAfterTests {

    private E1325_InsertAfter ia;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        ia = new E1325_InsertAfter();
        linkedList = ia.getLinkedList();
    }

    @Test
    public void test_insertAfter_itemIsNull_doesNotInsert() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.insertAfter(null, "EINS");

        Assert.assertEquals(4, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());

    }

    @Test
    public void test_insertAfter_afterIsNull_doesNotInsert() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.insertAfter("ZWEI", null);

        Assert.assertEquals(4, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());

    }

    @Test
    public void test_insertAfter_itemAndAfterAreNull_doesNotInsert() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.insertAfter(null, null);

        Assert.assertEquals(4, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());

    }


    @Test
    public void test_insertAfter_noAfter_doesntInsert() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.insertAfter("SIEBEN", "SECHS");

        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());
        Assert.assertEquals("VIER", linkedList.dequeue());
        Assert.assertEquals("FÜNF", linkedList.dequeue());
        Assert.assertNull(linkedList.dequeue());
    }

    @Test
    public void test_insertAfter_insertsItemImmediatelyAfter() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.insertAfter("ZWEI", "EINS");

        Assert.assertEquals(5, linkedList.size());
        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
        Assert.assertEquals("DREI", linkedList.dequeue());
    }


}
