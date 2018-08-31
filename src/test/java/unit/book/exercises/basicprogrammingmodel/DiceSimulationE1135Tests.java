package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.E1135_DiceSimulation;
import org.junit.Before;
import org.junit.Test;

public class DiceSimulationE1135Tests {

    E1135_DiceSimulation ds;

    @Before
    public void setup(){
        ds = new E1135_DiceSimulation();
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
