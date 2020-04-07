package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1318_XNextNext;
import book.exercises.E13_bagsqueuesandstacks.helper.NextNextLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class E1318_XNextNextTests {

    private E1318_XNextNext xnn;
    private NextNextLinkedList<String> linkedList;

    @Before
    public void setup() {
        xnn = new E1318_XNextNext();
        linkedList = new NextNextLinkedList<>();
    }

    @Test
    public void test_xNextNext_skipsNodes() {
        linkedList.add("Ana");
        linkedList.add("Suzana");
        linkedList.add("Nevena");
        linkedList.add("Tatjana");
        linkedList.add("Stefani");
        linkedList.add("Dragana");

        Assert.assertEquals("Ana", linkedList.get());
        Assert.assertEquals("Suzana", linkedList.get());

        Iterator<String> iterator = linkedList.iterator();
        Assert.assertEquals("Nevena", iterator.next());
        Assert.assertEquals("Stefani", iterator.next());

    }
}

