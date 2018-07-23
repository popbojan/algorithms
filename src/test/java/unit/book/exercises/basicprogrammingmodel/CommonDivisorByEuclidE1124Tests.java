package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.CommonDivisorByEuclidE1124;
import org.junit.Before;
import org.junit.Test;

public class CommonDivisorByEuclidE1124Tests {

    CommonDivisorByEuclidE1124 cdbe;

    @Before
    public void setup(){
        cdbe = new CommonDivisorByEuclidE1124();
    }

    @Test
    public void test_commonDivisor(){
        cdbe.commonDivisor();
    }
}
