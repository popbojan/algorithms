package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.RecursiveBinarySearchE1122;
import org.junit.Before;
import org.junit.Test;

public class RecursiveBinarySearchE1122Tests {

    RecursiveBinarySearchE1122 rbs;

    @Before
    public void setup(){
        rbs = new RecursiveBinarySearchE1122();
    }

    @Test
    public void test_printRecursiveDepth(){
        rbs.printRecursiveDepth();
    }

    @Test
    public void test_printNotFoundNumbers(){
        rbs.printNotFoundNumbers();
    }

    @Test
    public void test_printFoundNumbers(){
        rbs.printFoundNumbers();
    }
}
