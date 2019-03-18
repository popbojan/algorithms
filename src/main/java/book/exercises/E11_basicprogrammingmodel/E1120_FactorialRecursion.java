package book.exercises.E11_basicprogrammingmodel;

/**
 * Exercise 1.1.20:
 * Write a recursive static method that computes the value of ln (N!)
 */
public class E1120_FactorialRecursion {

    public int ln(int N){
        if(N ==1)
            return 1;
        return ln(N-1) * N;
    }
}
