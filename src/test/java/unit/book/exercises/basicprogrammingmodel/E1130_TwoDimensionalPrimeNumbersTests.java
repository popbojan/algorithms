package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1130_TwoDimensionalPrimeNumbers;
import org.junit.Before;
import org.junit.Test;

public class E1130_TwoDimensionalPrimeNumbersTests {

    E1130_TwoDimensionalPrimeNumbers tdpn;

    @Before
    public void setup(){
        tdpn = new E1130_TwoDimensionalPrimeNumbers();
    }

    @Test
    public void test_printIt(){
        tdpn.printIt();
    }
}