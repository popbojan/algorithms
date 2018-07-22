package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.HistogramE1115;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HistogramE1115Tests {

    HistogramE1115 h;

    @Before
    public void setup(){
        h = new HistogramE1115();
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
