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
    public void test_code_printsOutQueue(){
        saqp.pushToStack("Stack_First");
        saqp.pushToStack("Stack_Second");
        saqp.pushToStack("Stack_Third");
        saqp.pushToStack("Stack_Forth");
        saqp.pushToStack("Stack_Fifth");

        saqp.enqueueToQueue("Queue_First");
        saqp.enqueueToQueue("Queue_Second");
        saqp.enqueueToQueue("Queue_Third");
        saqp.enqueueToQueue("Queue_Forth");
        saqp.enqueueToQueue("Queue_Fifth");

        saqp.print();
    }
}
