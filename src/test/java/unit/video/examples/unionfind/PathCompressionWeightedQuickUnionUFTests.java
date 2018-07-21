package unit.video.examples.unionfind;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import video.examples.unionfind.PathCompressionWeightedQuickUnionUF;
import video.examples.unionfind.UF;

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

        pcwqu.union(0, 9);
        pcwqu.union(4, 9);

        pcwqu.printIdArray();

        /** this union compresses the path, because root of 1 is 5, whereas root of 5 is 7
         *  and afterwards root of 1 becomes 7
         */
        pcwqu.union(4, 1);

        pcwqu.printIdArray();

        assertTrue(pcwqu.connected(5, 9));
        assertTrue(pcwqu.connected(1, 5));
        assertTrue(pcwqu.connected(1, 7));
        assertTrue(pcwqu.connected(4, 7));

        pcwqu.printIdArray();
    }
    
}
