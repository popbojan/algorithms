package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.FibonacciRecursionE1119;
import org.junit.Before;
import org.junit.Test;

public class FibonacciRecursionE1119Tests {

    FibonacciRecursionE1119 fr;

    @Before
    public void setup() {
        fr = new FibonacciRecursionE1119();
    }

    @Test
    public void test_F() {
        fr.print();
    }

    @Test
    public void test_improvedF() {
        fr.printImproved();
    }
}
