package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E12_dataabstraction.helper.exception.SmartDateException;
import book.exercises.E13_bagsqueuesandstacks.E1316_ReadDates;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class E1316_ReadDatesTests {

    private E1316_ReadDates rd;

    @Before
    public void setup() {
        rd = new E1316_ReadDates();
    }

    @Test
    public void test_readDates_returnsDatesArray() throws SmartDateException {
        List<String> dates = new ArrayList<>();
        dates.add("4/5/2020");
        dates.add("2/25/1960");
        dates.add("08/12/1984");

        String[] result = rd.readDates(dates);

        Assert.assertEquals(3, result.length);
        Assert.assertEquals("08/12/1984", result[2]);
        Assert.assertEquals("2/25/1960", result[1]);
    }

    @Test
    public void test_readDates_invalidDate_throwsException() throws SmartDateException {
        List<String> dates = new ArrayList<>();
        dates.add("14/02/2020");
        dates.add("2/25/1960");
        dates.add("08/12/1984");

        try {
            String[] result = rd.readDates(dates);
        } catch (SmartDateException ex) {
            Assert.assertEquals("Date is not valid", ex.getMessage());
        }
    }

}
