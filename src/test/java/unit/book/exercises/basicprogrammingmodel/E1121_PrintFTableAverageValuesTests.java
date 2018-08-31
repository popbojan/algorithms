package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1121_PrintFTableAverageValues;
import book.exercises.basicprogrammingmodel.E1121_TableRowObject;
import org.junit.Before;
import org.junit.Test;

public class E1121_PrintFTableAverageValuesTests {

    E1121_PrintFTableAverageValues pftav;
    E1121_TableRowObject tro1, tro2, tro3, tro4;

    @Before
    public void setup() {
        pftav = new E1121_PrintFTableAverageValues();
        tro1 = new E1121_TableRowObject("aaa", 2, 3);
        tro2 = new E1121_TableRowObject("ddd", 4, 8);
        tro3 = new E1121_TableRowObject("ccc", 2, 3);
        tro4 = new E1121_TableRowObject("ggg", 10, 2);
    }

    @Test
    public void test_printF() {
        E1121_TableRowObject[] a = {tro1, tro2, tro3, tro4};
        pftav.printF(a);
    }
}
