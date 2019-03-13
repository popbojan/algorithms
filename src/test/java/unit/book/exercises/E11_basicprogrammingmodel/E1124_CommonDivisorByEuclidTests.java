package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1124_CommonDivisorByEuclid;
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
