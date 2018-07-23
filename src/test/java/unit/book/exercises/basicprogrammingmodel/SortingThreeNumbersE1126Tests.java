package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.SortingThreeNumbersE1126;
import org.junit.Before;
import org.junit.Test;

public class SortingThreeNumbersE1126Tests {

    SortingThreeNumbersE1126 stn;

    @Before
    public void setup(){
        stn = new SortingThreeNumbersE1126();
    }

    @Test
    public void test_sort(){
        stn.sort(2, 3, 1);
    }
}
