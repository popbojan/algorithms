package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1139_RandomMatches;
import org.junit.Before;
import org.junit.Test;

public class E1139_RandomMatchesTests {

    private E1139_RandomMatches rm;
    private final int T = 10;

    @Before
    public void setup(){
        rm = new E1139_RandomMatches();
    }

    @Test
    public void test_N10power3(){
        rm.n10power3(T, 1000);
    }
}
