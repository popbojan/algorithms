package unit.video.examples.priorityqueue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import video.examples.priorityqueue.BinaryHeapMaxPQ;

public class BinaryHeapMaxPQTests {

    BinaryHeapMaxPQ<Integer> bhmpq;

    @Before
    public void setup() {
        bhmpq = new BinaryHeapMaxPQ(5);
    }

    @Test
    public void test_delMax() {
        bhmpq.insert(0);
        bhmpq.insert(4);
        bhmpq.insert(2);
        bhmpq.insert(8);
        bhmpq.insert(5);

        Assert.assertEquals((Integer) 8, bhmpq.delMax());
    }
}
