package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1126_SortingThreeNumbers;
import org.junit.Before;
import org.junit.Test;

public class E1126_SortingThreeNumbersTests {

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
