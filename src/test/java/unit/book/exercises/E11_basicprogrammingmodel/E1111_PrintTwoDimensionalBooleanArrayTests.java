package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1111_PrintTwoDimensionalBooleanArray;
import org.junit.Before;
import org.junit.Test;

public class E1111_PrintTwoDimensionalBooleanArrayTests {

    E1111_PrintTwoDimensionalBooleanArray ptdba;

    @Before
    public void setup() {
        ptdba = new E1111_PrintTwoDimensionalBooleanArray();
    }

    @Test
    public void printIt() {
        ptdba.printArray();
    }

    @Test
    public void printE1113() {
        ptdba.printTranspositionE1113();
    }
}
