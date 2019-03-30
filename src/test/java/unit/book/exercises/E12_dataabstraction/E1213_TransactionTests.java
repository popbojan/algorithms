package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E1213_Transaction;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E1213_TransactionTests {

    E1213_Transaction t;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        t = new E1213_Transaction();
    }

    @Test
    public void test_creteTransaction() {
        t.createTransaction();
    }
}
