package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.BadShufflingE1137;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BadShufflingTestsE1137 {

    private BadShufflingE1137 bs;

    @Before
    public void setup() {
        bs = new BadShufflingE1137();
    }

    @Test
    @Ignore
    public void test_Nshuffles() {
        bs.Nshuffles(4, 1);

        bs.Nshuffles(4, 20);
    }
}
