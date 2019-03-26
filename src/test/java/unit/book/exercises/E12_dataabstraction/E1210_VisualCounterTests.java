package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1210_VisualCounter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E1210_VisualCounterTests {

    E1210_VisualCounter vc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        vc = new E1210_VisualCounter();
    }

    @Test
    public void test_createTallyPlot() {
        vc.createTallyPlot();
    }

}


