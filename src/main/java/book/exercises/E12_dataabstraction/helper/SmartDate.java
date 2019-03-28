package book.exercises.E12_dataabstraction.helper;

public class SmartDate extends DateAPIFromTheBook {

    private SmartDate(int month, int day, int year) {
        super(month, day, year);
    }

    public static SmartDate getSmartDate(int month, int day, int year) throws SmartDateException {
        if(!valid(month, day, year)){
            throw new SmartDateException("Date is not valid");
        }
        return new SmartDate(month, day, year);
    }

    private static boolean valid(int month, int day, int year) {
        return false;
    }

}
