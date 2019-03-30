package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1213_Transaction;
import book.exercises.E12_dataabstraction.TransactionException;
import book.exercises.E12_dataabstraction.helper.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class E1213_TransactionTests {

    E1213_Transaction t;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        t = new E1213_Transaction();
    }

    @Test
    public void test_creteTransaction_InvalidArticle_throwsException() {
        try {
            Transaction result = t.createTransaction("Onion", 2, 3.4);
            System.out.println(result.toString());
            fail();
        } catch (TransactionException tx) {
            assertEquals("There is no such article", tx.getMessage());
        }
    }

    @Test
    public void test_creteTransaction_InvalidAmount_throwsException() {
        try {
            Transaction result = t.createTransaction("Bread", 0, 0.55);
            System.out.println(result.toString());
            fail();
        } catch (TransactionException tx) {
            assertEquals("Amount should be greater than zero", tx.getMessage());
        }
    }

    @Test
    public void test_creteTransaction() throws TransactionException {
        Transaction result = t.createTransaction("Salt", 29, 200.03);
        System.out.println(result.toString());
    }
}
