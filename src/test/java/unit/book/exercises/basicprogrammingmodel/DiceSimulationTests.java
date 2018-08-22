package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.DiceSimulation;
import org.junit.Before;
import org.junit.Test;

public class DiceSimulationTests {

    DiceSimulation ds;

    @Before
    public void setup(){
        ds = new DiceSimulation();
    }

    @Test
    public void test_diceIt(){
        ds.diceIt();
    }
}
