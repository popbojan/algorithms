package unit.union.find;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import union.find.QuickUnionUF;
import union.find.UF;

import static org.junit.Assert.assertTrue;

public class QuickUnionUFTests {

    UF qu;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        qu = new QuickUnionUF(10);
    }

    @Test
    public void canBeCreated() {
        UF qu = new QuickUnionUF(10);
    }

    @Test
    public void union_unitedObjectsAreConnected() {
        qu.union(1,  5);
        qu.union(7, 1);

        qu.union(0, 9);
        qu.union(4, 9);

        qu.union(4, 1);

        assertTrue(qu.connected(5, 9));
        assertTrue(qu.connected(1, 5));
        assertTrue(qu.connected(1, 7));

        // this check iterate twice to find root, because root of 4 is 9 and root of 9 is 5
        assertTrue(qu.connected(4, 7));

        qu.printIdArray();
    }

}
