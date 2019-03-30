package book.exercises.E12_dataabstraction.helper;

import book.exercises.E12_dataabstraction.TransactionException;

import java.util.Arrays;

public class Transaction {

    private String article;
    private int amount;
    private double price;
    private static final String STATUS_OK = "OK";

    private Transaction(String article, int amount, double price) {
        this.article = article;
        this.amount = amount;
        this.price = price;
    }

    public static Transaction getTransaction(String article, int amount, double price) throws TransactionException {
        String statusMessage = validate(article, amount, price);
        if (!statusMessage.equals(STATUS_OK)) {
            throw new TransactionException(statusMessage);
        }
        return new Transaction(article, amount, price);
    }

    private static String validate(String article, int amount, double price) {
        String status = STATUS_OK;
        String[] articles = {"Apple", "Bread", "Salt", "Sugar"};
        if (!Arrays.stream(articles).anyMatch(x -> x.equals(article))) {
            status = "There is no such article";
        }
        if (amount < 1) {
            status = "Amount should be greater than zero";
        }
        if (price < 0.1) {
            status = "price should be greater that zero";
        }
        return status;
    }

    @Override
    public String toString() {
        return "Article: [" + article + "] Amount: [" + amount + "] Price: [" + price + "]";
    }
}
