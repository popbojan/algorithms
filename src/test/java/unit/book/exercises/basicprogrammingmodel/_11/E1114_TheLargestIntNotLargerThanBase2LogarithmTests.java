package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1114_TheLargestIntNotLargerThanBase2Logarithm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1114_TheLargestIntNotLargerThanBase2LogarithmTests {

    E1114_TheLargestIntNotLargerThanBase2Logarithm tlinltb2l;

    @Before
    public void setup(){
        tlinltb2l = new E1114_TheLargestIntNotLargerThanBase2Logarithm();
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
