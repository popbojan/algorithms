package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1111_PrintTwoDimensionalBooleanArray;
import org.junit.Before;
import org.junit.Test;

public class PrintTwoDimensionalBooleanArrayE1111Tests {

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
