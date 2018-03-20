package unit.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sort.KnuthShuffle;
import sort.Sort;

public class KnuthShuffleTests {

    Sort ks;

    @Before
    public void setup(){
        ks = new KnuthShuffle();
    }

    @Test
    public  void test_shuffle(){
        Comparable[] a = {1, 2, 3, 4, 5};

        ks.shuffle(a);

        Assert.assertFalse(ks.isSorted(a));
    }
}
