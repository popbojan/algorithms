package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.TwoDimensionalPrimeNumbersE1130;
import org.junit.Before;
import org.junit.Test;

public class TwoDimensionalPrimeNumbersE1130Tests {

    TwoDimensionalPrimeNumbersE1130 tdpn;

    @Before
    public void setup(){
        tdpn = new TwoDimensionalPrimeNumbersE1130();
    }

    @Test
    public void test_printIt(){
        tdpn.printIt();
    }
}
