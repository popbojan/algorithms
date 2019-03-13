package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E115_DoublesAreBetween0And1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E115_DoublesAreBetween0And1Tests {

    E115_DoublesAreBetween0And1 dab0a1;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        dab0a1 = new E115_DoublesAreBetween0And1();
    }

    @Test
    public void test_areBetween0and1_someNot_returnFalse() {
        double var1 = 0;
        double var2 = 0.3;
        double var4 = 1.5;

        double[] doubles = {var1, var2, var4, 3};

        Assert.assertFalse(dab0a1.areBetween0And1(doubles));
    }

    @Test
    public void test_areBetween0and1_returnTrue() {
        double var1 = 0;
        double var2 = 0.3;
        double var4 = 1;

        double[] doubles = {var1, var2, var4, 0.9};

        Assert.assertTrue(dab0a1.areBetween0And1(doubles));
    }
}
