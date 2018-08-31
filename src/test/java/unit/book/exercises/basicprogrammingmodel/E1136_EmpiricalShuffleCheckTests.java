package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1136_EmpiricalShuffleCheck;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class E1136_EmpiricalShuffleCheckTests {

    private E1136_EmpiricalShuffleCheck esc;

    @Before
    public void setup() {
        esc = new E1136_EmpiricalShuffleCheck();
    }

    @Test
    @Ignore
    public void test_Nshuffles() {
        esc.Nshuffles(4, 20);
    }
}
