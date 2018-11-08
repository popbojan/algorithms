package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1139_RandomMatches;
import org.junit.Before;
import org.junit.Test;

public class E1139_RandomMatchesTests {

    private E1139_RandomMatches rm;
    private final int T = 3;
    private final int POWERS = 4;

    @Before
    public void setup(){
        rm = new E1139_RandomMatches();
    }

    @Test
    public void test_N10power3(){
        rm.getAverageValuePerTTrialsForNPowerOf10(T, 1000);
    }

    @Test
	public void printAverageValueOfQuantityOverTheTTrialsForEachValueOfN()
	{
    	int[] arrays = new int[POWERS];
    	for(int i=0; i<arrays.length; i++) {
			arrays[i] = (int) Math.pow(10, 3+i);
		}
		rm.printAverageValueOfQuantityOverTheTTrialsForEachValueOfN(T, arrays);
	}
}
