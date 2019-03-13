package book.exercises.E11_basicprogrammingmodel;

public class E1120_FactorialRecursion {

    public int ln(int N){
        if(N ==1)
            return 1;
        return ln(N-1) * N;
    }
}
