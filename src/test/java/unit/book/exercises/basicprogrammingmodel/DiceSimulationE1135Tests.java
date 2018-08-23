package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.DiceSimulationEEE1135;
import org.junit.Before;
import org.junit.Test;

public class DiceSimulationE1135Tests {

    DiceSimulationEEE1135 ds;

    @Before
    public void setup(){
        ds = new DiceSimulationEEE1135();
    }

    @Test
    public void test_getProbabilityDistributionForTheSumOfTwoDice(){
        double dist = ds.getProbabilityDistributionForTheSumOfTwoDice(6, 6);
        System.out.println(dist);
    }

    @Test
    public void test_diceIt(){
        int N = 100;
        ds.diceIt(N);
    }
}
