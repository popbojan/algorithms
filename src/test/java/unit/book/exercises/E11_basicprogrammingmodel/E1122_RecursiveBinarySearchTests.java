package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1122_RecursiveBinarySearch;
import org.junit.Before;
import org.junit.Test;

public class E1122_RecursiveBinarySearchTests {

    E1122_RecursiveBinarySearch rbs;

    @Before
    public void setup() {
        rbs = new E1122_RecursiveBinarySearch();
    }

    @Test
    public void test_printRecursiveDepth() {
        rbs.printRecursiveDepth();
    }

    @Test
    public void test_printNotFoundNumbers() {
        rbs.printNotFoundNumbers();
    }

    @Test
    public void test_printFoundNumbers() {
        rbs.printFoundNumbers();
    }

    @Test
    public void test_printFoundNumbersFromDistinctArray() {
        rbs.printFoundNumbersFromDistinctArray();
    }

    @Test
    public void test_printFoundNumbersAndCountOfSmallerNumbersThanTheFoundedOnePlusCountOfElementsEqualToTheKey() {
        rbs.printFoundNumbersAndCountOfSmallerNumbersThanTheFoundedOnePlusCountOfElementsEqualToTheKey();
    }
}
