package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1330_DestructiveReverse;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1330_DestructiveReverseTests {

    private E1330_DestructiveReverse<String> dr;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        dr = new E1330_DestructiveReverse<>();
        linkedList = dr.getLinkedList();
    }

    @Test
    public void reverse_returnsDestructiveList() {
        linkedList.enqueue("AAA");
        linkedList.enqueue("BBB");
        linkedList.enqueue("CCC");
        linkedList.reverse("AAA");
        assertEquals("CCC", linkedList.dequeue());
        assertEquals("BBB", linkedList.dequeue());
        assertEquals("AAA", linkedList.dequeue());
    }

    @Test
    public void reverseRecursively_returnsDestructiveList() {
        linkedList.enqueue("AAA");
        linkedList.enqueue("BBB");
        linkedList.enqueue("CCC");
        linkedList.reverseRecursively("AAA");
        assertEquals("CCC", linkedList.dequeue());
        assertEquals("BBB", linkedList.dequeue());
        assertEquals("AAA", linkedList.dequeue());
    }
}
