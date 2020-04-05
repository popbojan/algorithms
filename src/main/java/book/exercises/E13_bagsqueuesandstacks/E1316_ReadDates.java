package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E12_dataabstraction.helper.SmartDate;
import book.exercises.E12_dataabstraction.helper.exception.SmartDateException;
import book.exercises.E13_bagsqueuesandstacks.helper.ResizingArrayQueue;

import java.util.List;

/**
 * Exercise 1.3.16:
 * Using readInts() on page 126 as a model, write a static method readDates() for Date that reads dates from standard
 * input in the format specified in the table on page 119 and returns an array containing them.
 */
public class E1316_ReadDates {

    ResizingArrayQueue<String> queue;

    public E1316_ReadDates() {
        queue = new ResizingArrayQueue();
    }

    public String[] readDates(List<String> dates) throws SmartDateException {
        for (String date : dates) {
            SmartDate smartDate = SmartDate.getInstance(date);
            if (smartDate != null) {
                queue.enqueue(date);
            }
        }

        int N = queue.size();
        String[] datesArray = new String[N];
        for (int i = 0; i < N; i++) {
            datesArray[i] = queue.dequeue();
        }
        return datesArray;
    }
}
