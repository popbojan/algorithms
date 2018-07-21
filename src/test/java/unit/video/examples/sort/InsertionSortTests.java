package unit.video.examples.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.sort.InsertionSort;
import video.examples.sort.Sort;

public class InsertionSortTests {

    Sort is;

    @Before
    public void setup() {
        is = new InsertionSort();
    }

    @Test
    public void test_sort() {
        Comparable[] a = {1, 2, 3, 4, 5};

        is.exchange(a, 1, 3);
        is.exchange(a, 4, 0);
        is.sort(a);

        Assert.assertTrue(is.isSorted(a));
    }
}
