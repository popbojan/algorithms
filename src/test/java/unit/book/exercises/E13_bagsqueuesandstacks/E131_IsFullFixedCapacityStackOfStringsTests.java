package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E131_IsFullFixedCapacityStackOfStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E131_IsFullFixedCapacityStackOfStringsTests {

    private E131_IsFullFixedCapacityStackOfStrings iffcsos;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        iffcsos = new E131_IsFullFixedCapacityStackOfStrings(5);
    }

    @Test
    public void test_isFull(){
        iffcsos = new E131_IsFullFixedCapacityStackOfStrings(3);
        iffcsos.push("FIRST_ITEM");
        iffcsos.push("SECOND_ITEM");
        iffcsos.push("THIRD_ITEM");
        Assert.assertFalse(iffcsos.isEmpty());
        Assert.assertTrue(iffcsos.isFull());
    }
}
