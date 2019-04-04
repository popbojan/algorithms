package book.exercises.E12_dataabstraction.helper;

import book.exercises.E12_dataabstraction.helper.exception.SmartDateException;

public class SmartDate extends DateAPIFromTheBook {

    private SmartDate(int month, int day, int year) {
        super(month, day, year);
    }

    public static SmartDate getSmartDate(int month, int day, int year) throws SmartDateException {
        if (!valid(month, day, year)) {
            throw new SmartDateException("Date is not valid");
        }
        return new SmartDate(month, day, year);
    }

    private static boolean valid(int month, int day, int year) {
        final int[] maxNumberOfDaysPerMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year < 0) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 0 || day > maxNumberOfDaysPerMonth[month - 1]) {
            return false;
        }
        if (month == 2) {
            if (year % 4 == 0 && day > 29) {
                return false;
            } else if (year % 4 != 0 && day > 28) {
                return false;
            }
        }
        return true;
    }

    public String dayOfTheWeek() {
        final String[] DAYSOFTHEWEEK = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int tmpMonth = month;
        int tmpYaer = year;
        if (tmpMonth < 3) {
            tmpMonth += 12;
            tmpYaer -= 1;
        }
        return DAYSOFTHEWEEK[((day + (((tmpMonth + 1) * 26) / 10) + tmpYaer % 100 + (tmpYaer % 100 / 4) + (tmpYaer / 400)) + (tmpYaer / 20) - 1) % 7];
    }
}
