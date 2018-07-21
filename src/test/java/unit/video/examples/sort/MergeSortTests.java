package unit.video.examples.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.sort.MergeSort;
import video.examples.sort.Sort;

public class MergeSortTests {

    Sort ms;

    @Before
    public void setup() {
        ms = new MergeSort();
    }

    @Test
    public void test_merge_withInsertionSort() {
        Comparable[] a = {1, 2, 3, 4, 5, 7};

        ms.exchange(a, 1, 3);
        ms.exchange(a, 4, 0);
        ms.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Assert.assertTrue(ms.isSorted(a));
    }

    @Test
    public void test_merge_withRealMerge() {
        Comparable[] a = {1, 2, 3, 4, 5, 7, 4, 8, 9, 6};

        ms.exchange(a, 1, 3);
        ms.exchange(a, 4, 0);
        ms.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Assert.assertTrue(ms.isSorted(a));
    }
}
