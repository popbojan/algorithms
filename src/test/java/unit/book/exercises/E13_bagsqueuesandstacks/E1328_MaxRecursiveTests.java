package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1328_MaxRecursive;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1328_MaxRecursiveTests {

    private E1328_MaxRecursive mr;
    private MyLinkedList<Integer> linkedList;

    @Before
    public void setup() {
        mr = new E1328_MaxRecursive();
        linkedList = mr.getLinkedList();
    }

    @Test
    public void max_returnsMaxNumber() {
        linkedList.enqueue(1);
        linkedList.enqueue(7);
        linkedList.enqueue(5);
        linkedList.enqueue(6);
        linkedList.enqueue(4);
        linkedList.enqueue(3);
        linkedList.enqueue(2);

        Assert.assertEquals(7, linkedList.maxRecursive());
    }

    @Test
    public void max_emptyList_returnsZero() {
        Assert.assertEquals(0, linkedList.maxRecursive());
    }

}
