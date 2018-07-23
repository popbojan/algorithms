package book.exercises.basicprogrammingmodel;

public class FactorialRecursionE1120 {

    public int ln(int N){
        if(N ==1)
            return 1;
        return ln(N-1) * N;
    }
}
