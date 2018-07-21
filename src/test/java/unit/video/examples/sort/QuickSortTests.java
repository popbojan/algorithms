package unit.video.examples.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.sort.QuickSort;
import video.examples.sort.Sort;

public class QuickSortTests {

    Sort qs;

    @Before
    public void setup() {
        qs = new QuickSort();
    }

    @Test
    public void test_sort() {
        Comparable[] a = {1, 2, 3, 4, 5};

        qs.exchange(a, 1, 3);
        qs.exchange(a, 4, 0);
        qs.sort(a);

        Assert.assertTrue(qs.isSorted(a));
    }
}
