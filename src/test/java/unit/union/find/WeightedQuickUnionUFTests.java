package unit.union.find;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import union.find.UF;
import union.find.WeightedQuickUnionUF;

import static org.junit.Assert.assertTrue;

public class WeightedQuickUnionUFTests {

    UF wqu;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        wqu = new WeightedQuickUnionUF(10);
    }

    @Test
    public void canBeCreated() {
        UF wqu = new WeightedQuickUnionUF(10);
    }
    @Test
    public void union_unitedObjectsAreConnected() {
        wqu.union(1,  5);
        wqu.union(7, 1);

        assertTrue(wqu.connected(1, 5));
        assertTrue(wqu.connected(1, 7));

        wqu.printIdArray();
    }

}
