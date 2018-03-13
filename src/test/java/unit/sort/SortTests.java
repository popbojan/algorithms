package unit.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sort.SelectionSort;
import sort.Sort;

public class SortTests {

    Sort sort;

    @Before
    public void setup() {
        sort = new SelectionSort();
    }

    @Test
    public void test_exchange() {
        Comparable[] a = {1, 2, 3, 4, 5};

        sort.exchange(a, 1, 3);

        Assert.assertEquals(a[1], 4);
        Assert.assertEquals(a[3], 2);
    }

    @Test
    public void test_less_isLess_returnsTrue() {
        Comparable a = 1;
        Comparable b = 6;
        Assert.assertTrue(sort.less(a, b));
    }

    @Test
    public void test_less_notLess_returnsFalse() {
        Comparable a = 4;
        Comparable b = 1;
        Assert.assertFalse(sort.less(a, b));
    }

    @Test
    public void test_isSorted_arrayIsSorted_returnsTrue() {
        Comparable[] a = {1, 2, 3, 4, 5};
        Assert.assertTrue(sort.isSorted(a));
    }

    @Test
    public void test_isSorted_arrayIsNotSorted_returnsFalse() {
        Comparable[] a = {1, 2, 5, 4, 3};
        Assert.assertFalse(sort.isSorted(a));
    }
}
