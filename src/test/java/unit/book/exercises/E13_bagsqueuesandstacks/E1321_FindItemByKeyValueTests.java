package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1321_FindItemByKeyValue;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1321_FindItemByKeyValueTests {

    private E1321_FindItemByKeyValue fibkv;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        fibkv = new E1321_FindItemByKeyValue();
        linkedList = fibkv.getLinkedList();
    }

    @Test
    public void test_find_returnsTrue() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("FÜNF");
        linkedList.enqueue("SECHS");

        Assert.assertTrue(linkedList.findItem("SECHS"));
        Assert.assertTrue(linkedList.findItem("ZWEI"));
    }

    @Test
    public void test_find_nonExistingItem_returnsFalse() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("FÜNF");
        linkedList.enqueue("SECHS");

        Assert.assertFalse(linkedList.findItem("SIEBEN"));
        Assert.assertFalse(linkedList.findItem("ACHT"));
        Assert.assertFalse(linkedList.findItem("NEUN"));
        Assert.assertFalse(linkedList.findItem("ZEHN"));
    }
}
