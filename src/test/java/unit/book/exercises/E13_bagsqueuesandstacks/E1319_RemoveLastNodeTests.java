package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1319_RemoveLastNode;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1319_RemoveLastNodeTests {

    private E1319_RemoveLastNode rln;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        rln = new E1319_RemoveLastNode();
        linkedList = rln.getLinkedList();
    }

    @Test
    public void test_remove_removesLastNode() {
        linkedList.enqueue("EINS!");
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();
        Assert.assertTrue(linkedList.isEmpty());
        Assert.assertEquals(0, linkedList.size());

        linkedList.enqueue("EINS!");
        linkedList.enqueue("ZWEI!");
        linkedList.enqueue("DREI");
        Assert.assertFalse(linkedList.isEmpty());
        Assert.assertEquals(3, linkedList.size());

        linkedList.removeLast();
        linkedList.removeLast();
        Assert.assertFalse(linkedList.isEmpty());
        Assert.assertEquals(1, linkedList.size());

        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();
        Assert.assertTrue(linkedList.isEmpty());
        Assert.assertEquals(0, linkedList.size());
        linkedList.dequeue();

    }
}
