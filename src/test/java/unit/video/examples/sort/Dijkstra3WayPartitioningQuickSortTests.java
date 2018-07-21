package unit.video.examples.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.sort.QuickSort;
import video.examples.sort.Sort;


public class Dijkstra3WayPartitioningQuickSortTests {

    Sort d3wpqs;

    @Before
    public void setup() {
        d3wpqs = new QuickSort();
    }

    @Test
    public void test_sort() {
        Comparable[] a = {1, 2, 3, 4, 5};

        d3wpqs.exchange(a, 1, 3);
        d3wpqs.exchange(a, 4, 0);
        d3wpqs.sort(a);

        Assert.assertTrue(d3wpqs.isSorted(a));
    }
}
