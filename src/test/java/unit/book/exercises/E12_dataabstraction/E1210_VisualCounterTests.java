package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1210_VisualCounter;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E1210_VisualCounterTests {

    E1210_VisualCounter vc;
    final int N = 100;
    final int max = 10;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        vc = new E1210_VisualCounter();
    }

    @Test
    @Ignore
    public void test_drawTallyPlot() {
        vc.drawTallyPlot(N, max);
    }

    @Test
    public void test_printTallyPlot() {
        vc.printTallyPlot(N, max);
    }
}


