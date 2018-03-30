package unit.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sort.ImprovedMergeSort;
import sort.Sort;

public class ImprovedMergeSortTests {

    Sort ims;

    @Before
    public void setup() {
        ims = new ImprovedMergeSort();
    }

    @Test
    public void test_merge() {
        Comparable[] a = {1, 2, 3, 4, 5, 7, 8, 9, 6, 11};

        ims.exchange(a, 1, 3);
        ims.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Assert.assertTrue(ims.isSorted(a));
    }
}
