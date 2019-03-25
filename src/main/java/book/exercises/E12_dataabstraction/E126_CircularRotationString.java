package book.exercises.E12_dataabstraction;

/**
 * Exercise 1.2.6:
 * A string s is a circular rotation of a string t if it matches when the characters are circularly
 * shifted by any number of positions; e.g., ACTGACG is a circular shift of TGACGAC, and vise versa.
 * Detecting this condition is important in the study of genomic sequences. Write a program that checks
 * whether two given strings s and t are circular shifts of one another. Hint: The solution is a one-liner
 * with indexOf(), length(), and string concatenation.
 */
public class E126_CircularRotationString {

    public boolean check(String s, String t) {
        return s != null && t != null && s.length() == t.length() && (s + s).contains(t);
    }

    public boolean checkByTheBookHint(String s, String t){
        return s != null && t != null && s.length() == t.length() && s.concat(s).indexOf(t) >= 0;
    }
}
