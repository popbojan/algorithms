package book.exercises.basicprogrammingmodel;

import java.util.Random;

public class E1139_RandomMatches {

    private Random random;
    private int[] firstArray;
    private int[] secondArray;
    private final int FROM = 100000;
    private final int LIMIT = 99999;

    public E1139_RandomMatches(){
        random = new Random();
    }

    public void n10power3(int T, int N){
        initializeArrays(N);
    }

    private void initializeArrays(int N){
        firstArray = new int[N];
        secondArray = new int[N];
        for(int i=0; i<N; i++){
            int first = FROM + random.nextInt(LIMIT);
            int second = FROM + random.nextInt(LIMIT);
        }
    }
}
