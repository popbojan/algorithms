package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.FixedCapacityStackOfStrings;

/**
 * Exercise 1.3.6:
 * Add a method peek() to Stack that returns the most recently inserted item
 * on the stack (without poping it)
 */
public class E137_PeekStack {

    private FixedCapacityStackOfStrings stack;

    public E137_PeekStack(int capacity){
        stack = new FixedCapacityStackOfStrings(capacity);
    }

    public String peek() {
        return stack.peek();
    }

    public void pushToStack(String item){
        stack.push(item);
    }

    public String popFromStack(){
        return stack.pop();
    }
}
