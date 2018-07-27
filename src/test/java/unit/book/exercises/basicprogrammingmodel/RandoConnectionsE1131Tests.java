package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.RandomConnectionsE1131;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class RandoConnectionsE1131Tests {

    RandomConnectionsE1131 rc;

    @Before
    public void setup() {
        rc = new RandomConnectionsE1131();
    }

    @Test
    @Ignore
    public void test_connect() {
        rc.connect(13, 2, 0.3);
    }
}
