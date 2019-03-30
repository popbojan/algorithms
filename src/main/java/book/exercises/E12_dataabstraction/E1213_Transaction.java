package book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.helper.Transaction;

/**
 * Exercise: 1.2.13:
 * Using our implementation of Date as a model (page 91),
 * develop an implementation of Transaction.
 */
public class E1213_Transaction {

    public Transaction createTransaction(String article, int amount, double price) throws TransactionException {
        return Transaction.getTransaction(article, amount, price);
    }
}
