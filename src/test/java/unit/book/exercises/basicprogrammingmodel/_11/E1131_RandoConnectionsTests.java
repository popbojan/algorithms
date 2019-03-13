package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1131_RandomConnections;
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
