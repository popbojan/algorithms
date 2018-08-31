package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1124_CommonDivisorByEuclid;
import org.junit.Before;
import org.junit.Test;

public class CommonDivisorByEuclidE1124Tests {

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
