package book.exercises.E11_basicprogrammingmodel;

/**
 *
 * Exercise 1.1.9:
 * Write a code fragment that puts the binary representation of a positive integer
 * N into a String s.
 */
public class E119_BinaryRepresentationOfIntegerToString {

    public String getBinaryStringOfGivenNumber(int N){
        String s = "";
        for(int n = N; n > 0; n/=2){
            s = (n % 2) + s;
        }
        return s;
    }
}
