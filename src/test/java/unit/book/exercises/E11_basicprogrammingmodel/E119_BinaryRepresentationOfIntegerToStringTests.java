package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E119_BinaryRepresentationOfIntegerToString;
import edu.princeton.cs.introcs.StdOut;
import org.junit.Before;
import org.junit.Test;

public class E119_BinaryRepresentationOfIntegerToStringTests {

    E119_BinaryRepresentationOfIntegerToString broits;

    @Before
    public void setup(){
        broits = new E119_BinaryRepresentationOfIntegerToString();
    }

    @Test
    public void test_toBinaryString(){
        StdOut.println(broits.getBinaryStringOfGivenNumber(10));
    }
}
