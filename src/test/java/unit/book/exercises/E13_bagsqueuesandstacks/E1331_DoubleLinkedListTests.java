package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1331_DoubleLinkedList;
import book.exercises.E13_bagsqueuesandstacks.helper.DoubleLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1331_DoubleLinkedListTests {

    private E1331_DoubleLinkedList<String> dll;
    private DoubleLinkedList<String> doubleLinkedList;

    @Before
    public void setup() {
        dll = new E1331_DoubleLinkedList();
        doubleLinkedList = dll.getDoubleLinkedList();
    }

    @Test
    public void test1_insertAtTheEndRemoveFromTheBeginning_returnsRightItems() {
        doubleLinkedList.insertAtTheEnd("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());

        doubleLinkedList.insertAtTheEnd("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());

    }

    @Test
    public void test2_insertAtTheBeginningRemoveFromTheBeginning_returnsRightItems() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheBeginning("Burzum");
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());

        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheBeginning("Burzum");
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
    }

    @Test
    public void test3_insertAtTheBeginningInsertAtTheEndRemoveFromTheBeginning_returnsRightItems() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Marduk");
        assertEquals("Simple Red", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Marduk", doubleLinkedList.removeFromTheBeginning());

        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Marduk");
        assertEquals("Simple Red", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Marduk", doubleLinkedList.removeFromTheBeginning());
    }

    @Test
    public void test4_insertAtTheEndRemoveFromTheEnd_returnsRightItems() {
        doubleLinkedList.insertAtTheEnd("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        assertEquals("Burzum", doubleLinkedList.removeFromTheEnd());
        assertEquals("Sting", doubleLinkedList.removeFromTheEnd());

        // 2nd time
        doubleLinkedList.insertAtTheEnd("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        assertEquals("Burzum", doubleLinkedList.removeFromTheEnd());
        assertEquals("Sting", doubleLinkedList.removeFromTheEnd());
    }

    @Test
    public void test5_insertAtTheBeginningRemoveFromTheEnd_returnsRightItems() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheBeginning("Burzum");
        assertEquals("Sting", doubleLinkedList.removeFromTheEnd());
        assertEquals("Burzum", doubleLinkedList.removeFromTheEnd());
        assertEquals(null, doubleLinkedList.removeFromTheEnd());

        // 2nd time
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheBeginning("Burzum");
        assertEquals("Sting", doubleLinkedList.removeFromTheEnd());
        assertEquals("Burzum", doubleLinkedList.removeFromTheEnd());
        assertEquals(null, doubleLinkedList.removeFromTheEnd());
    }

    @Test
    public void test6_insertAtTheBeginningInsertAtTheEndRemoveFromTheEnd_returnsRightItems() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Marduk");
        assertEquals("Marduk", doubleLinkedList.removeFromTheEnd());
        assertEquals("Burzum", doubleLinkedList.removeFromTheEnd());
        assertEquals("Sting", doubleLinkedList.removeFromTheEnd());
        assertEquals("Simple Red", doubleLinkedList.removeFromTheEnd());

        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Marduk");
        assertEquals("Marduk", doubleLinkedList.removeFromTheEnd());
        assertEquals("Burzum", doubleLinkedList.removeFromTheEnd());
        assertEquals("Sting", doubleLinkedList.removeFromTheEnd());
        assertEquals("Simple Red", doubleLinkedList.removeFromTheEnd());
    }

    @Test
    public void test7_insertBefore_second_insertsBeforeSecond() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Marduk");

        doubleLinkedList.insertBefore("Sting", "Slayer");

        assertEquals("Simple Red", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Slayer", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Marduk", doubleLinkedList.removeFromTheBeginning());
    }

    @Test
    public void test8_insertBefore_first_insertsBeforeFirst() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Marduk");

        doubleLinkedList.insertBefore("Simple Red", "Slayer");

        assertEquals("Slayer", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Simple Red", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Marduk", doubleLinkedList.removeFromTheBeginning());
    }

    @Test
    public void test9_insertBefore_beforeLast_insertsBeforeLast() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Marduk");

        doubleLinkedList.insertBefore("Marduk", "Slayer");

        assertEquals("Simple Red", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Slayer", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Marduk", doubleLinkedList.removeFromTheBeginning());
    }

    @Test
    public void test10_insertAfter_second_insertsAfterSecond() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheEnd("Marduk");

        doubleLinkedList.insertAfter("Sting", "Slayer");

        assertEquals("Simple Red", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Slayer", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Marduk", doubleLinkedList.removeFromTheBeginning());
    }

    @Test
    public void test11_insertAfter_last_insertsAfterLast() {
        doubleLinkedList.insertAtTheBeginning("Sting");
        doubleLinkedList.insertAtTheBeginning("Simple Red");
        doubleLinkedList.insertAtTheEnd("Burzum");
        doubleLinkedList.insertAtTheEnd("Marduk");

        doubleLinkedList.insertAfter("Marduk", "Slayer");

        assertEquals("Simple Red", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Sting", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Burzum", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Marduk", doubleLinkedList.removeFromTheBeginning());
        assertEquals("Slayer", doubleLinkedList.removeFromTheBeginning());
    }


}
