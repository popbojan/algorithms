package unit.book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.E135_StackForBinaryTransformation;
import org.junit.Before;
import org.junit.Test;

public class E135_StackForBinaryTransformationTests {

    E135_StackForBinaryTransformation sfbt;

    @Before
    public void setup(){
        sfbt = new E135_StackForBinaryTransformation();
    }

    @Test
    public void test_print_NIs50_printsOutBinaryRepresentationOfN(){
        sfbt.print(50);
    }
}
