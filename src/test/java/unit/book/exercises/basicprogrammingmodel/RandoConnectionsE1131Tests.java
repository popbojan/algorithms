package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1131_RandomConnections;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class RandoConnectionsE1131Tests {

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
