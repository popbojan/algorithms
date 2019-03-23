package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E124_PrintFragment;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E124_PrintFragmentTests {

    E124_PrintFragment pf;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        pf = new E124_PrintFragment();
    }

    @Test
    public void test_e_124_printFragment() {

        pf.e_124_printFragment();
    }

    @Test
    public void test_e_125_printFragment() {

        pf.e_125_printFragment();
    }

}
