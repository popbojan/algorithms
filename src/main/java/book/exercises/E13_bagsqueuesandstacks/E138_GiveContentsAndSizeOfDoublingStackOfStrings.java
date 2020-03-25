package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.DoublingStackOfStrings;

/**
 * Exercise 1.3.8:
 * Give the contents and size of the array for DoublingStackOfStrings with the input:
 *
 * it was - the best - of times - - - it  was - the - -
 *
 * Check out page 136
 */
public class E138_GiveContentsAndSizeOfDoublingStackOfStrings {

    private DoublingStackOfStrings stack;

    public E138_GiveContentsAndSizeOfDoublingStackOfStrings(int capacity){
        stack = new DoublingStackOfStrings(capacity);
    }

    public DoublingStackOfStrings getStack() {
        return stack;
    }
}
