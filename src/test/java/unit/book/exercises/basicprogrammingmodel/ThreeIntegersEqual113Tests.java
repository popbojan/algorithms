package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.ThreeIntegersEqual113;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class ThreeIntegersEqual113Tests {

    ThreeIntegersEqual113 tie;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        tie = new ThreeIntegersEqual113();
    }

    @Test
    public void test_areEqual_notEqual_returnFalse() {
        int first = 12;
        int second = 8;
        int third = 1984;

        Assert.assertFalse(tie.areEqual(first, second, third));
    }

    @Test
    public void test_areEqual_equal_returnTrue() {
        int first = 12;
        int second = 12;
        int third = 12;

        Assert.assertTrue(tie.areEqual(first, second, third));
    }

    @Test
    public void test_areEqual_firstAndThirdAreEqualSecondIsNot_returnFalse() {
        int first = 12;
        int second = 8;
        int third = 12;

        Assert.assertFalse(tie.areEqual(first, second, third));
    }
}
