package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1139_RandomMatches;
import org.junit.Before;
import org.junit.Test;

public class E1139_RandomMatchesTests {

    private E1139_RandomMatches rm;
    private final int T = 1;
    private final int POWERS = 2;

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
			arrays[i] = (int) Math.pow(10, 2+i);
		}
		rm.printAverageValueOfQuantityOverTheTTrialsForEachValueOfN(T, arrays);
	}
}
