package unit.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sort.QuickSelect;
import sort.Sort;

public class QuickSelectTests {

    Sort qs;

    @Before
    public void setup() {
        qs = new QuickSelect();
    }

    @Test
    public void test_select() {
        Comparable[] a = {1, 2, 3, 4, 5};

        qs.exchange(a, 1, 3);
        qs.exchange(a, 4, 0);
        Comparable result = qs.select(a, 4);

        Assert.assertEquals((Comparable) 5, result);
    }
}
