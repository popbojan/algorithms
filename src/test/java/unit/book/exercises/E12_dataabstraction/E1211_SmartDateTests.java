package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1211_SmartDate;
import book.exercises.E12_dataabstraction.helper.SmartDate;
import book.exercises.E12_dataabstraction.helper.SmartDateException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class E1211_SmartDateTests {

    E1211_SmartDate sd;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        sd = new E1211_SmartDate();
    }

    @Test
    @Ignore
    public void test_creteInvalidDate() {
        try {
            SmartDate result = sd.createDate(2, 30, 1984);
            System.out.println(result.toString());
            fail();
        } catch (SmartDateException e) {
            assertEquals("Date is not valid", e.getMessage());
        }
    }

    @Test
    @Ignore
    public void test_creteValidDate() throws SmartDateException {
        SmartDate result = sd.createDate(2, 29, 1984);
        System.out.println(result.toString());
    }
}
