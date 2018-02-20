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

        assertTrue(qu.connected(1, 5));
        assertTrue(qu.connected(1, 7));

        qu.printIdArray();
    }

}
