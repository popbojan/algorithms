package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E136_StackAndQueuePrint;
import org.junit.Before;
import org.junit.Test;

public class E136_StackAndQueuePrintTests {

    private E136_StackAndQueuePrint saqp;

    @Before
    public void setup(){
        saqp = new E136_StackAndQueuePrint();
    }

    @Test
    public void test_code_printsSomething(){
        saqp.print();
    }
}
