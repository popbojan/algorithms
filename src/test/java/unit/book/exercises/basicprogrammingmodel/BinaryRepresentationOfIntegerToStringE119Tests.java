package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.BinaryRepresentationOfIntegerToStringE119;
import edu.princeton.cs.introcs.StdOut;
import org.junit.Before;
import org.junit.Test;

public class BinaryRepresentationOfIntegerToStringE119Tests {

    BinaryRepresentationOfIntegerToStringE119 broits;

    @Before
    public void setup(){
        broits = new BinaryRepresentationOfIntegerToStringE119();
    }

    @Test
    public void test_toBinaryString(){
        StdOut.println(broits.toBinaryString(10));
    }
}
