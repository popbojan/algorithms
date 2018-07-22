package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.PrintValuesE117;
import org.junit.Before;
import org.junit.Test;

public class PrintValuesE117Tests {

    PrintValuesE117 pv;

    @Before
    public void setup()
    {
        pv = new PrintValuesE117();
    }

    @Test
    public void test_printA(){
        pv.printA();
    }

    @Test
    public void test_printB(){
        pv.printB();
    }

    @Test
    public void test_printC(){
        pv.printC();
    }

    @Test
    public void test_printChar(){
        pv.printChars();
    }

    @Test
    public void test_print1112(){
        pv.print1112();
    }
}