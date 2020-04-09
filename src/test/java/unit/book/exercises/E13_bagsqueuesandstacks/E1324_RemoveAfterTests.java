package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1324_RemoveAfter;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Before;
import org.junit.Test;

public class E1324_RemoveAfterTests {

    private E1324_RemoveAfter ra;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        ra = new E1324_RemoveAfter();
        linkedList = ra.getLinkedList();
    }

    @Test
    public void test_removeAfter_removesNodeAfterParticularItem() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("FÜNF");

        //TODO: to be implemented fully
        //linkedList.removeAfter("DREI");
    }
}
