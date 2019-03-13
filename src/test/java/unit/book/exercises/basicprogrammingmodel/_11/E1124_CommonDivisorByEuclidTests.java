package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1124_CommonDivisorByEuclid;
import org.junit.Before;
import org.junit.Test;

public class E1124_CommonDivisorByEuclidTests {

    E1124_CommonDivisorByEuclid cdbe;

    @Before
    public void setup(){
        cdbe = new E1124_CommonDivisorByEuclid();
    }

    @Test
    public void test_commonDivisor(){
        cdbe.commonDivisor();
    }
}
