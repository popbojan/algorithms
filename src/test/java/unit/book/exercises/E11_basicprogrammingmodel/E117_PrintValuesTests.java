package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E117_PrintValues;
import org.junit.Before;
import org.junit.Test;

public class E117_PrintValuesTests {

    E117_PrintValues pv;

    @Before
    public void setup() {
        pv = new E117_PrintValues();
    }

    @Test
    public void test_printA() {
        pv.printA();
    }

    @Test
    public void test_printB() {
        pv.printB();
    }

    @Test
    public void test_printC() {
        pv.printC();
    }

    @Test
    public void test_printChar() {
        pv.printChars();
    }

    @Test
    public void test_print1112() {
        pv.print1112();
    }

    @Test
    public void test_print1116() {
        pv.print1116();
    }

    @Test(expected = StackOverflowError.class)
    public void test_print1117() {
        pv.print1117();
    }

    @Test
    public void test_print1118() {
        pv.print1118();
    }
}
