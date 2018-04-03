package unit.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sort.BottomUpMergeSort;
import sort.Sort;

public class BootomUpMergeSortTests {
    Sort bums;

    @Before
    public void setup() {
        bums = new BottomUpMergeSort();
    }

    @Test
    public void test_merge() {
        Comparable[] a = {1, 2, 3, 4, 5, 7, 8, 9, 6, 11};

        bums.exchange(a, 1, 3);
        bums.exchange(a, 5, 7);
        bums.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Assert.assertTrue(bums.isSorted(a));
    }
}
