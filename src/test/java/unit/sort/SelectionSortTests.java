package unit.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sort.SelectionSort;
import sort.Sort;

public class SelectionSortTests {

    Sort ss;

    @Before
    public void setup() {
        ss = new SelectionSort();
    }

    @Test
    public void test_sort() {
        Comparable[] a = {1, 2, 3, 4, 5};

        ss.exchange(a, 1, 3);
        ss.exchange(a, 4, 0);
        ss.sort(a);

        Assert.assertTrue(ss.isSorted(a));
    }
}
