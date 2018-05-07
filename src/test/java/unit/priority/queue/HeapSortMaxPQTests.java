package unit.priority.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import priority.queue.HeapSortMaxPQ;
import sort.Sort;

public class HeapSortMaxPQTests {

    Sort hsmpq;

    @Before
    public void setup() {
        hsmpq = new HeapSortMaxPQ();
    }

    @Test
    public void test_sort() {
        Comparable[] a = {1, 2, 3, 4, 5, 6};

        hsmpq.exchange(a, 1, 3);
        hsmpq.exchange(a, 4, 0);
        hsmpq.exchange(a, 2, 5);
        hsmpq.sort(a);

        Assert.assertTrue(hsmpq.isSorted(a));
    }
}
