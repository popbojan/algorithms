package book.exercises.E12_dataabstraction;

/**
 * Exercise 1.2.4::
 * What does the following code fragment print?
 * <p>
 * String string1 = "hello";
 * String string2 = string1;
 * string1 = "world";
 * StdOut.println(string1);
 * StdOut.println(string2);
 * <p>
 * Exercise 1.2.5:
 * What does the following code fragment print?
 * <p>
 * String s = "Hello World";
 * s.toUpperCase();
 * s.substring(6, 11);
 * StdOut.println(s);
 * <p>
 * Answer: "Hello World". String objects are immutable - string methods return a new
 * String object with the appropriate value (but they do not change the value of the
 * object that was used to invoke them). This code ignores the objects returned and
 * just prints the original string. To print "WORLD", use s = s.toUpperCase() and
 * s = s.substring(6, 11).
 */
public class E124_PrintFragment {

    public void e_124_printFragment() {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        System.out.println(string1);
        System.out.println(string2);
    }

    public void e_125_printFragment() {
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        System.out.println(s);
    }
}
