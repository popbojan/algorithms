package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1211_SmartDate;
import book.exercises.E12_dataabstraction.helper.SmartDate;
import book.exercises.E12_dataabstraction.helper.exception.SmartDateException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class E1211_SmartDateTests {

    E1211_SmartDate sd;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        sd = new E1211_SmartDate();
    }

    @Test
    public void test_creteDate_dateInvalid_throwsException() {
        try {
            SmartDate result = sd.createDate(2, 30, 1984);
            System.out.println(result.toString());
            fail();
        } catch (SmartDateException e) {
            assertEquals("Date is not valid", e.getMessage());
        }
    }

    @Test
    public void test_creteDate() throws SmartDateException {
        SmartDate result = sd.createDate(2, 29, 1984);
        System.out.println(result.toString());
    }

    @Test
    public void test_createDate_dayOfTheWeek_wrong() throws SmartDateException {
        SmartDate result = sd.createDate(8, 12, 2002);
        assertNotSame("Sunday", result.dayOfTheWeek());
    }

    @Test
    public void test_createDate_dayOfTheWeek() throws SmartDateException {
        SmartDate result = sd.createDate(8, 12, 2001);
        assertEquals("Sunday", result.dayOfTheWeek());
    }
}
