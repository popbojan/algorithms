package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E131_IsFullFixedCapacityStackOfStrings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E131_IsFullFixedCapacityStackOfStringsTests {

    private E131_IsFullFixedCapacityStackOfStrings iffcsos;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        iffcsos = new E131_IsFullFixedCapacityStackOfStrings();
    }

    @Test
    public void test(){
        iffcsos = new E131_IsFullFixedCapacityStackOfStrings();
    }
}
