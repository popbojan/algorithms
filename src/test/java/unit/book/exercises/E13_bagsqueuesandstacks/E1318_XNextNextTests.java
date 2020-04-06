package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1318_XNextNext;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class E1318_XNextNextTests {

    private E1318_XNextNext xnn;
    private MyLinkedList<String> myLinkedList;

    @Before
    public void setup() {
        xnn = new E1318_XNextNext();
        myLinkedList = new MyLinkedList<>();
    }

    @Test
    public void test_xNextNext_skipsNodes() {
        myLinkedList.add("Ana");
        myLinkedList.add("Suzana");
        myLinkedList.add("Nevena");
        myLinkedList.add("Tatjana");
        myLinkedList.add("Stefani");
        myLinkedList.add("Dragana");

        Assert.assertEquals("Ana", myLinkedList.get());
        Assert.assertEquals("Suzana", myLinkedList.get());

        Iterator<String> iterator = myLinkedList.iterator();
        Assert.assertEquals("Nevena", iterator.next());
        Assert.assertEquals("Stefani", iterator.next());

    }
}

