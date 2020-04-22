package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E1326_RemoveAllOccurrencesOfTheKey;
import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1326_RemoveAllOccurrencesOfTheKeyTests {

    private E1326_RemoveAllOccurrencesOfTheKey raootk;
    private MyLinkedList<String> linkedList;

    @Before
    public void setup() {
        raootk = new E1326_RemoveAllOccurrencesOfTheKey();
        linkedList = raootk.getLinkedList();
    }

    @Test
    public void test_remove_removesAllOccurrences() {
        linkedList.enqueue("EINS");
        linkedList.enqueue("ZWEI");
        linkedList.enqueue("DREI");
        linkedList.enqueue("VIER");
        linkedList.enqueue("DREI");
        linkedList.enqueue("FÜNF");
        linkedList.enqueue("DREI");
        linkedList.enqueue("SECHS");
        linkedList.enqueue("DREI");

        linkedList.removeAll("DREI");
        Assert.assertEquals(5, linkedList.size());
    }
}
