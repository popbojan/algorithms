package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1327_Max;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1327_MaxTests {

    private E1327_Max m;
    private MyLinkedList<Integer> linkedList;

    @Before
    public void setup() {
        m = new E1327_Max();
        linkedList = m.getLinkedList();
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

        Assert.assertEquals(7, linkedList.max());
    }

    @Test
    public void max_emptyList_returnsZero() {
        Assert.assertEquals(0, linkedList.max());
    }
}
