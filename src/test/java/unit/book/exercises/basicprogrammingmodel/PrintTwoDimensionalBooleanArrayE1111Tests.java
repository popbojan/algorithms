package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.PrintTwoDimensionalBooleanArrayE1111;
import org.junit.Before;
import org.junit.Test;

public class PrintTwoDimensionalBooleanArrayE1111Tests {

    PrintTwoDimensionalBooleanArrayE1111 ptdba;

    @Before
    public void setup() {
        ptdba = new PrintTwoDimensionalBooleanArrayE1111();
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
