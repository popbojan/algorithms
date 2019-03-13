package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E116_PrintFibonacciNumbers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E116_PrintFibonacciNumbersTests {

    E116_PrintFibonacciNumbers flp;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        flp = new E116_PrintFibonacciNumbers();
    }

    @Test
    public void test_printIt() {
        flp.printIt();
    }
}
