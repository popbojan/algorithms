package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.PrintFTableAverageValuesE1121;
import book.exercises.basicprogrammingmodel.TableRowObjectE1121;
import org.junit.Before;
import org.junit.Test;

public class PrintFTableAverageValuesE1121Tests {

    PrintFTableAverageValuesE1121 pftav;
    TableRowObjectE1121 tro1, tro2, tro3, tro4;

    @Before
    public void setup(){
        pftav = new PrintFTableAverageValuesE1121();
        tro1 = new TableRowObjectE1121("aaa", 2, 3);
        tro2 = new TableRowObjectE1121("ddd", 4, 8);
        tro3 = new TableRowObjectE1121("ccc", 2, 3);
        tro4 = new TableRowObjectE1121("ggg", 10, 2);
    }

    @Test
    public void test_printF(){
        TableRowObjectE1121[] a = {tro1, tro2, tro3, tro4};
        pftav.printF(a);
    }
}
