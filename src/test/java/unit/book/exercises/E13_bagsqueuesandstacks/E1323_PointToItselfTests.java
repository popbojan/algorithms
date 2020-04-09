package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1323_PointToItself;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1323_PointToItselfTests {

    private E1323_PointToItself pti;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        pti = new E1323_PointToItself();
        linkedList = pti.getLinkedList();
    }

    @Test
    public void test_pointToItself_returnsSameNode() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        linkedList.pointToItself("ZWEI", "EINS");

        Assert.assertEquals("EINS", linkedList.dequeue());
        Assert.assertNull(linkedList.dequeue());
    }
}
