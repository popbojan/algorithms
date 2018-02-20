package unit.union.find;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import union.find.PathCompressionWeightedQuickUnionUF;
import union.find.UF;

import static org.junit.Assert.assertTrue;

public class PathCompressionWeightedQuickUnionUFTests {
    
    UF pcwqu;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        pcwqu = new PathCompressionWeightedQuickUnionUF(10);
    }

    @Test
    public void canBeCreated() {
        UF pcwqu = new PathCompressionWeightedQuickUnionUF(10);
    }
    @Test
    public void union_unitedObjectsAreConnected() {
        pcwqu.union(1,  5);
        pcwqu.union(7, 1);

        assertTrue(pcwqu.connected(1, 5));
        assertTrue(pcwqu.connected(1, 7));

        pcwqu.printIdArray();
    }
    
}
