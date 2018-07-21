package unit.video.examples.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.sort.KnuthShuffle;
import video.examples.sort.Sort;

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
