package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1319_RemoveLastNode;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Before;
import org.junit.Test;

public class E1319_RemoveLastNodeTests {

    private E1319_RemoveLastNode rln;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup(){
        rln = new E1319_RemoveLastNode();
        linkedList = rln.getLinkedList();
    }

    @Test
    public void test_remove_removesLastNode(){
        linkedList.enqueue("EINS!");
        linkedList.removeLast();
    }
}
