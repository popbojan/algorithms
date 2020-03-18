package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E_133_IntermixedSequenceOfStackOperations;
import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;
import org.junit.Before;
import org.junit.Test;

public class E_133_IntermixedSequenceOfStackOperationsTests {

    private E_133_IntermixedSequenceOfStackOperations isoso;
    private JavaStack<Integer> stack;

    @Before
    public void setup(){
        isoso = new E_133_IntermixedSequenceOfStackOperations();
        stack = isoso.getStack();
    }

    @Test
    public void test_aScenario_sequenceCannotOccur(){
        //stack

    }
}
