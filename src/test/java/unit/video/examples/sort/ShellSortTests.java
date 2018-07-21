package unit.video.examples.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.sort.ShellSort;
import video.examples.sort.Sort;

public class ShellSortTests {

    Sort ss;

    @Before
    public void setup() {
        ss = new ShellSort();
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
