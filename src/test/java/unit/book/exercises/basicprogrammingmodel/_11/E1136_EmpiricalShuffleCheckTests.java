package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1136_EmpiricalShuffleCheck;
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
