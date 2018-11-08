package unit.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import utils.BinarySearch;

public class BinarySearchTests {

    BinarySearch bs;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        bs = new BinarySearch();
    }

    @Test
    public void canBeCreated() {
        BinarySearch bs = new BinarySearch();
    }

    @Test
    public void binarySearch_elementIsFound() {
        Comparable a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = bs.binarySearch(a, 8);

        Assert.assertEquals(7, result);
    }
}
