package book.exercises.basicprogrammingmodel;

import utils.BinarySearch;
import video.examples.sort.MergeSort;

import java.util.Random;

public class E1139_RandomMatches {

    private MergeSort ms = new MergeSort();
    private BinarySearch bs = new BinarySearch();
    private Random random;
    private Integer[] firstArray;
    private Integer[] secondArray;
    private final int FROM = 100000;
    private final int LIMIT = 899999;

    public E1139_RandomMatches(){
        random = new Random();
    }

    public void n10power3(int T, int N){
        for(int i=0; i<T; i++) { // T trials
            initializeArrays(N);
            findMatches(N);
        }
    }

    private void initializeArrays(int N){
        firstArray = new Integer[N];
        secondArray = new Integer[N];
        for(int i=0; i<N; i++){
            int first = FROM + random.nextInt(LIMIT);
            int second = FROM + random.nextInt(LIMIT);
            firstArray[i] = first;
            secondArray[i] = second;
        }
    }

    private void findMatches(int N){
        ms.sort(secondArray);
        for(int i=0; i<N; i++){
            int index = bs.binarySearch(secondArray,  firstArray[i]);
            if(index != -1){
                System.out.println("MATCH");
                System.out.println("FirstArrayValue: " + firstArray[i]);
                System.out.println("SecondArrayValue: " + secondArray[index]);
            }

        }
    }
}
