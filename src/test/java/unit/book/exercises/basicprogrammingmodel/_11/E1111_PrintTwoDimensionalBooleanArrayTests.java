package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1111_PrintTwoDimensionalBooleanArray;
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
