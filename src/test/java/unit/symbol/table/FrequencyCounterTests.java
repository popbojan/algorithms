package unit.symbol.table;

import org.junit.Before;
import org.junit.Test;
import symbol.table.FrequencyCounter;

public class FrequencyCounterTests {

    FrequencyCounter frequencyCounter;

    @Before
    public void setup() {

        frequencyCounter = new FrequencyCounter();
    }

    @Test
    public void test_method() {

        String yyeah[] = {"word", "word", "sick"};
        frequencyCounter.method(3, yyeah);

    }
}
