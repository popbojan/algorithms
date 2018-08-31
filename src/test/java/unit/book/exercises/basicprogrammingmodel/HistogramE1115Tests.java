package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1115_Histogram;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HistogramE1115Tests {

    E1115_Histogram h;

    @Before
    public void setup(){
        h = new E1115_Histogram();
    }

    @Test
    public void test_histogram(){
        int[] a = {1, 1, 2, 3, 5, 8, 13};
        int M = 5;

        int[] result = h.histogram(a, M);

        Assert.assertEquals(result[0], 0);
        Assert.assertEquals(result[1], 2);
        Assert.assertEquals(result[2], 1);
    }
}
