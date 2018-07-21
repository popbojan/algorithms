package unit.video.examples.unionfind;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import video.examples.unionfind.QuickFindUF;
import video.examples.unionfind.UF;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class QuickFindUFTests {

    UF uf;

    @Mock
    UF ufMock;

    @Before
    public void setup()
    {
        uf = new QuickFindUF(10);

        MockitoAnnotations.initMocks(this);

        when(ufMock.count()).thenReturn(10);
    }

    @Test
    public void count() {
        assertEquals(10, ufMock.count());
    }

    @Test
    public void union_unitedObjectsAreConnected(){
        uf.union(1,  2);
        uf.union(9, 2);
        uf.union(7, 3);

        assertTrue(uf.connected(1, 2));
        assertTrue(uf.connected(9, 2));
        assertTrue(uf.connected(7, 3));

        assertFalse(uf.connected(1, 5));

        uf.printIdArray();
    }


}
