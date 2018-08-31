package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1119_FibonacciRecursion;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FibonacciRecursionE1119Tests {

    E1119_FibonacciRecursion fr;

    @Before
    public void setup() {
        fr = new E1119_FibonacciRecursion();
    }

    @Test()
    @Ignore
    public void test_F() {
        fr.print();
    }

    @Test
    public void test_improvedF() {
        fr.calculateFibonacciNumbersForGivenLength();
    }
}
