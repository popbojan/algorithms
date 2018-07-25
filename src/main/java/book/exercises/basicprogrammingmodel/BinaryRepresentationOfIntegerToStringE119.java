package book.exercises.basicprogrammingmodel;

public class BinaryRepresentationOfIntegerToStringE119 {

    public String getBinaryStringOfGivenNumber(int N){
        String s = "";
        for(int n = N; n > 0; n/=2){
            s = (n % 2) + s;
        }
        return s;
    }
}
