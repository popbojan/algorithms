package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1131_RandomConnections;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class E1131_RandoConnectionsTests {

    E1131_RandomConnections rc;

    @Before
    public void setup() {
        rc = new E1131_RandomConnections();
    }

    @Test
    @Ignore
    public void test_connect() {
        rc.connect(13, 2, 0.3);
    }
}
