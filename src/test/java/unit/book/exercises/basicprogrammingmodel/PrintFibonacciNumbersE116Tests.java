package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.PrintFibonacciNumbersE116;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class PrintFibonacciNumbersE116Tests {

    PrintFibonacciNumbersE116 flp;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        flp = new PrintFibonacciNumbersE116();
    }

    @Test
    public void test_printIt() {
        flp.printIt();
    }
}
