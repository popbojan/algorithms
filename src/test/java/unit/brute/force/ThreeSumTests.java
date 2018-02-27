package unit.brute.force;

import brute.force.ThreeSum;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;


public class ThreeSumTests {

    ThreeSum ts;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        ts = new ThreeSum();
    }

    @Test
    public void canBeCreated() {
        ThreeSum ts = new ThreeSum();
    }

    @Test
    public void count(){
        int[] a = {1, 2, 3, 4, 5, 6};
        int count = ts.count(a);

        System.out.print(count);

        assertEquals(count, 3);
    }
}
