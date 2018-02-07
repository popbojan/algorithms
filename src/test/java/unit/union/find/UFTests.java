package unit.union.find;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import union.find.UF;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UFTests {

    @Mock
    UF uf;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        when(uf.count()).thenReturn(10);
    }

    @Test
    public void happyPath() {
        UF uf1 = new UF(10);
        assertEquals(-1, uf1.count());
    }


}
