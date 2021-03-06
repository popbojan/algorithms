package book.exercises.E12_dataabstraction;

import book.exercises.E11_basicprogrammingmodel.helper.TransactionException;
import book.exercises.E12_dataabstraction.helper.Transaction;

/**
 * Exercise: 1.2.13:
 * Using our implementation of Date as a model (page 91),
 * develop an implementation of Transaction.
 * <p>
 * Exercise 1.2.14:
 * Using our implementation of equals() in Date as a model (page 103), develop
 * implementation of equals() for Transaction.
 */
public class E1213_Transaction {

    public Transaction createTransaction(String article, int amount, double price) throws TransactionException {
        return Transaction.getInstance(article, amount, price);
    }
}
