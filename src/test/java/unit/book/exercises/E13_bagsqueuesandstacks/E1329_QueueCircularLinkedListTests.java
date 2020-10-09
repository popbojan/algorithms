package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1329_QueueCircularLinkedList;
import book.exercises.E13_bagsqueuesandstacks.helper.CircularLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class E1329_QueueCircularLinkedListTests {

    private E1329_QueueCircularLinkedList qcll;
    private CircularLinkedList<String> circularLinkedList;

    @Before
    public void setup() {
        qcll = new E1329_QueueCircularLinkedList();
        circularLinkedList = qcll.getCircularLinkedList();
    }

    @Test
    public void enqueue_dequeueProperly() {

        circularLinkedList.enqueue("EINS");
        circularLinkedList.enqueue("ZWEI");
        circularLinkedList.enqueue("DREI");
        circularLinkedList.enqueue("VIER");
        circularLinkedList.enqueue("FÜNF");
        circularLinkedList.enqueue("SECHS");
        circularLinkedList.enqueue("SIEBEN");
        circularLinkedList.enqueue("ACHT");
        circularLinkedList.enqueue("NEUN");
        circularLinkedList.enqueue("ZEHN");

        assertEquals("EINS", circularLinkedList.dequeue());
        assertEquals(9, circularLinkedList.size());
        assertEquals("ZWEI", circularLinkedList.dequeue());
        assertEquals(8, circularLinkedList.size());
        assertEquals("DREI", circularLinkedList.dequeue());
        assertEquals(7, circularLinkedList.size());
        assertEquals("VIER", circularLinkedList.dequeue());
        assertEquals(6, circularLinkedList.size());
        assertEquals("FÜNF", circularLinkedList.dequeue());
        assertEquals(5, circularLinkedList.size());
        assertEquals("SECHS", circularLinkedList.dequeue());
        assertEquals(4, circularLinkedList.size());
        assertEquals("SIEBEN", circularLinkedList.dequeue());
        assertEquals(3, circularLinkedList.size());
        assertEquals("ACHT", circularLinkedList.dequeue());
        assertEquals(2, circularLinkedList.size());
        assertEquals("NEUN", circularLinkedList.dequeue());
        assertEquals(1, circularLinkedList.size());
        assertEquals("ZEHN", circularLinkedList.dequeue());
        assertEquals(0, circularLinkedList.size());

        circularLinkedList.enqueue("EINS");
        circularLinkedList.enqueue("ZWEI");
        circularLinkedList.enqueue("DREI");
        assertEquals("EINS", circularLinkedList.dequeue());
        assertEquals(2, circularLinkedList.size());
        assertEquals("ZWEI", circularLinkedList.dequeue());
        assertEquals(1, circularLinkedList.size());
        assertEquals("DREI", circularLinkedList.dequeue());
        assertEquals(0, circularLinkedList.size());

        assertNull(circularLinkedList.dequeue());
    }

}
