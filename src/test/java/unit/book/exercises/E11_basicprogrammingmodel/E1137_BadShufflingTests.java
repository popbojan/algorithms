package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1137_BadShuffling;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class E1137_BadShufflingTests {

    private E1137_BadShuffling bs;

    @Before
    public void setup() {
        bs = new E1137_BadShuffling();
    }

    @Test
    @Ignore
    public void test_Nshuffles() {
        bs.Nshuffles(4, 1);

        bs.Nshuffles(4, 20);
    }
}
