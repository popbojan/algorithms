package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1322_InsertNodeImmediatelyAfterParticularNode;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1322_InsertNodeImmediatelyAfterParticularNodeTests {

    private E1322_InsertNodeImmediatelyAfterParticularNode iniapn;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        iniapn = new E1322_InsertNodeImmediatelyAfterParticularNode();
        linkedList = iniapn.getLinkedList();
    }

    @Test
    public void test_insertAfter_insertsItemImmediatelyAfter() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.insertAfter("ZWEI", "EINS");

        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertEquals("ZWEI", linkedList.dequeue());
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
}
