package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1127_BinomialDistribution;
import org.junit.Before;
import org.junit.Test;

public class E1127_BinomialDistributionTests {

    E1127_BinomialDistribution bd;

    @Before
    public void setup(){
        bd = new E1127_BinomialDistribution();
    }

    @Test
    public void test_numberOfRecursiveCalls(){
        bd.numberOfRecursiveCalls();
    }
}
