package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.TheLargestIntNotLargerThanBase2LogarithmE1114;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheLargestIntNotLargerThanBase2LogarithmE1114Tests {

    TheLargestIntNotLargerThanBase2LogarithmE1114 tlinltb2l;

    @Before
    public void setup(){
        tlinltb2l = new TheLargestIntNotLargerThanBase2LogarithmE1114();
    }

    @Test
    public void test_lg_8_retruns3(){
        Assert.assertEquals(3, tlinltb2l.lg(8));
    }

    @Test
    public void test_lg_100_retruns6(){
        Assert.assertEquals(6, tlinltb2l.lg(100));
    }
}
