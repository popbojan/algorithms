package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1218_VarianceForAccumulator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E1218_VarianceForAccumulatorTests {

    E1218_VarianceForAccumulator vfa;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        vfa = new E1218_VarianceForAccumulator();
    }

    @Test
    public void test_validate(){
        vfa.validate();
    }
}
