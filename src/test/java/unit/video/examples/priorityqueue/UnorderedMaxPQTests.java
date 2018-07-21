package unit.video.examples.priorityqueue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.priorityqueue.UnorderedMaxPQ;

public class UnorderedMaxPQTests {

    UnorderedMaxPQ<Integer> umpq;

    @Before
    public void setup() {
        umpq = new UnorderedMaxPQ(5);
    }

    @Test
    public void test_delMax() {
        umpq.insert(0);
        umpq.insert(4);
        umpq.insert(2);
        umpq.insert(8);
        umpq.insert(5);

        Assert.assertEquals((Integer) 5, umpq.delMax());
    }
}
