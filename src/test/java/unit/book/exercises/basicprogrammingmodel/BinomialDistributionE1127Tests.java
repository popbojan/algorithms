package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1127_BinomialDistribution;
import org.junit.Before;
import org.junit.Test;

public class BinomialDistributionE1127Tests {

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
