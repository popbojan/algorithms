package unit.union.find;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import union.find.QuickUnionUF;

import static org.junit.Assert.assertEquals;

public class QuickUnionUFTests {

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void canBeCreated() {
        QuickUnionUF qu = new QuickUnionUF(10);
    }
}
