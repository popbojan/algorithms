package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;

/**
 * Exercise 1.3.2:
 * Give the output printed by java stack for the input:
 * it was - the best - of times - - - it was - the - -
 */
public class E132_GiveTheOutputPrintedByJavaStackForTheInput {

    private JavaStack<String> stack;

    public E132_GiveTheOutputPrintedByJavaStackForTheInput(){
        stack = new JavaStack<>();
    }

    public JavaStack<String> getStack() {
        return stack;
    }
}
