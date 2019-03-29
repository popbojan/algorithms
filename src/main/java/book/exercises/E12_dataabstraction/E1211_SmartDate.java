package book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.helper.SmartDate;
import book.exercises.E12_dataabstraction.helper.SmartDateException;

/**
 * Exercise 1.2.11:
 * Develop an implementation SmartDate of our Date API that raises an exception of the date is not legal
 */
public class E1211_SmartDate {

    public SmartDate createDate(int month, int day, int year) throws SmartDateException {
        return SmartDate.getSmartDate(month, day, year);
    }
}
