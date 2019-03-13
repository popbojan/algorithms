package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1130_TwoDimensionalPrimeNumbers;
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
