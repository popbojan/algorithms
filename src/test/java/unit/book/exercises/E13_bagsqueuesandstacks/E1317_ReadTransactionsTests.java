package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E11_basicprogrammingmodel.helper.TransactionException;
import book.exercises.E12_dataabstraction.helper.exception.SmartDateException;
import book.exercises.E13_bagsqueuesandstacks.E1317_ReadTransactions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class E1317_ReadTransactionsTests {

    private E1317_ReadTransactions rt;

    @Before
    public void setup() {
        rt = new E1317_ReadTransactions();
    }

    @Test
    public void test_readTransactions_returnsTransactionsArray() throws SmartDateException, TransactionException {
        List<String> transactions = new ArrayList<>();
        transactions.add("Salt 13 13.22");
        transactions.add("Sugar 11 10.78");

        String[] result = rt.readTransactions(transactions);

        Assert.assertEquals(2, result.length);
        Assert.assertEquals("Salt 13 13.22", result[0]);
        Assert.assertEquals("Sugar 11 10.78", result[1]);
    }

    @Test
    public void test_readDates_invalidDate_throwsException() {
        List<String> transactions = new ArrayList<>();
        transactions.add("Pepper 15 9.13");
        transactions.add("Sugar 11 10.78");

        try {
            String[] result = rt.readTransactions(transactions);
        } catch (TransactionException ex) {
            Assert.assertEquals("There is no such article", ex.getMessage());
        }
    }

}
