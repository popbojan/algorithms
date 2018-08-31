package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1126_SortingThreeNumbers;
import org.junit.Before;
import org.junit.Test;

public class SortingThreeNumbersE1126Tests {

    E1126_SortingThreeNumbers stn;

    @Before
    public void setup(){
        stn = new E1126_SortingThreeNumbers();
    }

    @Test
    public void test_sort(){
        stn.sort(2, 3, 1);
    }
}
