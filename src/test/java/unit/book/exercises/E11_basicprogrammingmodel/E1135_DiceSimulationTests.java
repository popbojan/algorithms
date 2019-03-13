package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1135_DiceSimulation;
import org.junit.Before;
import org.junit.Test;

public class E1135_DiceSimulationTests {

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
