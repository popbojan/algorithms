package book.exercises.basicprogrammingmodel;

        import edu.princeton.cs.introcs.StdOut;

public class PrintFibonacciNumbersE116 {

    public void printIt() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            f = f + g;
            g = f - g;
            StdOut.println(f);
        }
    }
}
