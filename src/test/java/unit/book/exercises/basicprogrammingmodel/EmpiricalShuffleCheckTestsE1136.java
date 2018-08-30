package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.EmpiricalShuffleCheckE1136;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class EmpiricalShuffleCheckTestsE1136 {

    private EmpiricalShuffleCheckE1136 esc;

    @Before
    public void setup() {
        esc = new EmpiricalShuffleCheckE1136();
    }

    @Test
    @Ignore
    public void test_Nshuffles() {
        esc.Nshuffles(4, 20);
    }
}
