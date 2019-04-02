package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1215_FileInputSplitter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class E1215_FileInputSplitterTests {

    E1215_FileInputSplitter fis;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        fis = new E1215_FileInputSplitter();
    }

    @Test
    public void test_splitIntsFromString() {
        String input = "123 16 7 6 5 99 87 12";
        int[] result = fis.splitIntsFromString(input);
        assertEquals(123, result[0]);
        assertEquals(87, result[6]);
        assertEquals(6, result[3]);
    }
}
