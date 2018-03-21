package unit.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sort.MergeSort;
import sort.Sort;

public class MergeSortTests {

    Sort ms;

    @Before
    public void setup() {
        ms = new MergeSort();
    }

    @Test
    public void test_merge() {
        Comparable[] a = {1, 2, 3, 4, 5};

        ms.exchange(a, 1, 3);
        ms.exchange(a, 4, 0);
        ms.sort(a);

        Assert.assertTrue(ms.isSorted(a));
    }
}
