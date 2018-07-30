package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.DrawHistogramE1132;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DrawHistogramE1132Tests {

    DrawHistogramE1132 dh;
    int N;
    double l;
    double r;


    @Before
    public void setup(){
        double[] stream = new double[]{1.2, 3.5, 18.1, 0.3, 2, 58.1, 37,2, 1.2, 2, 7, 7, 7.3, 18.9, 32};
        N = 5;
        l =  42.3;
        r = 25.2;
        dh = new DrawHistogramE1132(stream, N, l, r);
    }

    @Test
    @Ignore
    public void test_draw(){
        dh.draw();
    }

    @Test
    public void test_getIntervals_returnsNEqualSizedIntervals(){
        N = 5;
        l =  42.3;
        r = 25.2;
        double[] intervals = dh.getIntervals(N, l, r);
        Assert.assertEquals(N, intervals.length);
    }

    @Test
    public void test_getIntervals_returnsNEqualSpacedIntervals(){
        N = 7;
        l = 29.3;
        r = 25.2;
        double range = (l > r) ? (l - r) : (r - l);
        double space = range / (N -1);
        double inconsiderableDifference = 0.1;

        double[] intervals = dh.getIntervals(N, l, r);
        Assert.assertEquals(space, intervals[1] -intervals[0], inconsiderableDifference);
    }
}
