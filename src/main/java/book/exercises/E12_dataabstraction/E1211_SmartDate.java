package book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.helper.SmartDate;
import book.exercises.E12_dataabstraction.helper.exception.SmartDateException;

/**
 * Exercise 1.2.11:
 * Develop an implementation SmartDate of our Date API that raises an exception of the date is not legal.
 *
 * Exercise 1.2.12:
 * Add a method dayOfTheWeek() to SmartDate that returns a String value Monday, Tuesday, Wednesday,
 * Thursday, Friday, Saturday or Sunday, giving the appropriate day of the week for the date.
 * You may assume that the date is in the 21st century.
 */
public class E1211_SmartDate {

    public SmartDate createDate(int month, int day, int year) throws SmartDateException {
        return SmartDate.getSmartDate(month, day, year);
    }
}
