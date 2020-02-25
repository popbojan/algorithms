package book.exercises.E12_dataabstraction.helper;

import book.exercises.E11_basicprogrammingmodel.helper.TransactionException;

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

    public static Transaction getInstance(String article, int amount, double price) throws TransactionException {
        String status = getStatus(article, amount, price);
        if (!status.equals(STATUS_OK)) {
            throw new TransactionException(status);
        }
        return new Transaction(article, amount, price);
    }

    public static Transaction getInstance(String transaction) throws TransactionException {
        String[] fields = transaction.split(" ");
        String article = fields[0];
        int amount = Integer.parseInt(fields[1]);
        double price = Double.parseDouble(fields[2]);

        String status = getStatus(article, amount, price);
        if (!status.equals(STATUS_OK)) {
            throw new TransactionException(status);
        }
        return new Transaction(article, amount, price);
    }

    private static String getStatus(String article, int amount, double price) {
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

    @Override
    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        if (x == null) {
            return false;
        }
        if (this.getClass() != x.getClass()) {
            return false;
        }
        Transaction that = (Transaction) x;
        if (!this.article.equals(that.article)) {
            return false;
        }
        if (this.amount != that.amount) {
            return false;
        }
        if (this.price != that.price) {
            return false;
        }
        return true;
    }
}
