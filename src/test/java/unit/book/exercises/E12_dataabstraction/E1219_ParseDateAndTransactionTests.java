package unit.book.exercises.E12_dataabstraction;

import book.exercises.E11_basicprogrammingmodel.helper.TransactionException;
import book.exercises.E12_dataabstraction.E1219_ParseDateAndTransaction;
import book.exercises.E12_dataabstraction.helper.SmartDate;
import book.exercises.E12_dataabstraction.helper.Transaction;
import book.exercises.E12_dataabstraction.helper.exception.SmartDateException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class E1219_ParseDateAndTransactionTests {

    private E1219_ParseDateAndTransaction pdat;

    @Before
    public void setup() {
        pdat = new E1219_ParseDateAndTransaction();
    }

    @Test
    public void test_createTransaction_createsTransaction() throws TransactionException {
        Assert.assertTrue(pdat.createTransaction("Apple 10 52374.22") instanceof Transaction);
    }

    @Test
    public void test_createTransaction_noArticle_throwsException(){
        try {
            pdat.createTransaction("Kivik 10 52374.22");
            fail();
        }catch (TransactionException ex){
            assertEquals("There is no such article", ex.getMessage());
        }
    }

    @Test
    public void test_createDate_createsDate() throws SmartDateException {
        Assert.assertTrue(pdat.createDate("12/12/1984") instanceof SmartDate);
    }

    @Test
    public void test_createDate_dateInvalid_throwsException() {
        try {
            pdat.createDate("22/02/2002");
            fail();
        } catch (SmartDateException e) {
            assertEquals("Date is not valid", e.getMessage());
        }
    }
}
