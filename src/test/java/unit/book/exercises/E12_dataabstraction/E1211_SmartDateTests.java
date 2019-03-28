package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1211_SmartDate;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E1211_SmartDateTests {

    E1211_SmartDate sd;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        sd = new E1211_SmartDate();
    }

    @Test
    @Ignore
    public void test_drawTallyPlot() {
        sd.createDate();
    }
}
