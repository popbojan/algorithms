package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1218_VarianceForAccumulator;
import edu.princeton.cs.algs4.Accumulator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E1218_VarianceForAccumulatorTests {

    final double INCONSIDERABLE_DIFFERENCE = 0.1;
    E1218_VarianceForAccumulator vfa;
    Accumulator accumulator;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        vfa = new E1218_VarianceForAccumulator();
        accumulator = new Accumulator();
    }

    @Test
    public void test_validate_mean(){
        vfa.addDataValue(10);

        vfa.addDataValue(5);
        Assert.assertEquals(7.5, vfa.validateMean(), INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_validate_variance(){
        vfa.addDataValue(10);
        vfa.addDataValue(5);
        Assert.assertEquals(12.5, vfa.validateVar(), INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_validate_standardDeviation(){
        vfa.addDataValue(10);
        vfa.addDataValue(5);
        Assert.assertEquals(3.53, vfa.validateStdev(), INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_validate_variance_fromAlgs4(){
        accumulator.addDataValue(10);
        accumulator.addDataValue(5);
        Assert.assertEquals(12.5, accumulator.var(), INCONSIDERABLE_DIFFERENCE);
    }
}
