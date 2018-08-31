package book.exercises.basicprogrammingmodel;

public class E119_BinaryRepresentationOfIntegerToString {

    public String getBinaryStringOfGivenNumber(int N){
        String s = "";
        for(int n = N; n > 0; n/=2){
            s = (n % 2) + s;
        }
        return s;
    }
}
