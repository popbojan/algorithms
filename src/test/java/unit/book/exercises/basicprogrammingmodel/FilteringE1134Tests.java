package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.FilteringE1134;
import org.junit.Before;
import org.junit.Test;

public class FilteringE1134Tests {

    FilteringE1134 f;

    @Before
    public void setup(){
        f = new FilteringE1134();
    }

    @Test
    public void test_printMaximumAndMinimum(){
        double[] N = {0.8, 0.1, 0, 0.9, 0.754};
        f.printMaximumAndMinimum(N);
    }
}
