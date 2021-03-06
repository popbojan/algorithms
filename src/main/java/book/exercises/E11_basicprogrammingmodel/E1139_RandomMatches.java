package book.exercises.E11_basicprogrammingmodel;

import utils.BinarySearch;
import video.examples.sort.MergeSort;

import java.util.Random;

/**
 *
 * Exercise 1.1.39:
 * Random matches. Write a BinarySearch client that takes an int value T as command-line argument
 * and returns T trials of the following experiment for N = pow(10, 3), pow(10, 4), pow(10, 5), pow(10, 6):
 * generate two arrays of N randomly generated positive six-digit int values,
 * and find the number of values that appear in both arrays. Print a table giving the average value of
 * this quantity over the T trials for each value of N.
 *
 */
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

    public int getAverageValuePerTTrialsForNPowerOf10(int T, int N){
    	int totalMatchPerT = 0;
        for(int i=0; i<T; i++) { // T trials
            initializeArrays(N);
			totalMatchPerT+= findAndCountMatches(N);
        }
		int average = totalMatchPerT/T;
        return average;
    }

    public void printAverageValueOfQuantityOverTheTTrialsForEachValueOfN(int T, int[] arrays){
		for(int i=0; i<arrays.length; i++){
			int averageValuePerN = getAverageValuePerTTrialsForNPowerOf10(T, arrays[i]);
			System.out.print("N: "+ arrays[i] + " avarage value per N for T trials: " + averageValuePerN);
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

    private int findAndCountMatches(int N){
    	int countMatches = 0;
    	ms.sort(firstArray); //?
        ms.sort(secondArray);
        for(int i=0; i<N; i++){
            int index = bs.binarySearch(secondArray,  firstArray[i]);
            if(index != -1){
            	countMatches++;
//                System.out.println("MATCH");
//                System.out.println("FirstArrayValue: " + firstArray[i]);
//                System.out.println("SecondArrayValue: " + secondArray[index]);
            }
        }
        return countMatches;
    }
}
