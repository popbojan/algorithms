package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E11_basicprogrammingmodel.helper.TransactionException;
import book.exercises.E12_dataabstraction.helper.Transaction;
import book.exercises.E13_bagsqueuesandstacks.helper.ResizingArrayQueue;

import java.util.List;

/**
 * Exercise 1.3.17:
 * Do exercise 1.3.16 for Transaction.
 */
public class E1317_ReadTransactions {

    private ResizingArrayQueue<String> queue;

    public E1317_ReadTransactions() {
        queue = new ResizingArrayQueue();
    }

    public String[] readTransactions(List<String> transactions) throws TransactionException {
        for (String transaction : transactions) {
            Transaction tr = Transaction.getInstance(transaction);
            if (tr != null) {
                queue.enqueue(transaction);
            }
        }

        int N = queue.size();
        String[] transactionsArray = new String[N];
        for (int i = 0; i < N; i++) {
            transactionsArray[i] = queue.dequeue();
        }
        return transactionsArray;
    }

}
