package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.BinomialDistributionE1127;
import org.junit.Before;
import org.junit.Test;

public class BinomialDistributionE1127Tests {

    BinomialDistributionE1127 bd;

    @Before
    public void setup(){
        bd = new BinomialDistributionE1127();
    }

    @Test
    public void test_numberOfRecursiveCalls(){
        bd.numberOfRecursiveCalls();
    }
}
