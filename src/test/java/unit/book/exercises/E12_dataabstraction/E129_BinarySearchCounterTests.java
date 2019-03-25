package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E129_BinarySearchCounter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E129_BinarySearchCounterTests {

    E129_BinarySearchCounter bsc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        bsc = new E129_BinarySearchCounter();
    }

    @Test
    public void test_count() {
        bsc.count();
    }
}
