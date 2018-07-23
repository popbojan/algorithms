package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.CommonDivisorByEuclidE1123;
import org.junit.Before;
import org.junit.Test;

public class CommonDivisorByEuclidE1123Tests {

    CommonDivisorByEuclidE1123 cdbe;

    @Before
    public void setup(){
        cdbe = new CommonDivisorByEuclidE1123();
    }

    @Test
    public void test_commonDivisor(){
        cdbe.commonDivisor();
    }
}
