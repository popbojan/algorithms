package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.ResizingArrayStack;

/**
 * Exercise 1.3.12:
 * Write an iterable Stack client that has a static method copy() that takes a stack of stings as argument
 * and returns a copy of the stack. Note: This ability is a prime example of the value of having an iterator,
 * because it allows development of such functionality without changing the basic API.
 * Check out page 141 in the book
 */
public class E1312_CopyIterableStack<Item> {

    private ResizingArrayStack<Item> temp;
    private ResizingArrayStack<Item> newStack;

    public E1312_CopyIterableStack() {

    }

    public ResizingArrayStack<Item> copy(ResizingArrayStack<Item> stack) {
        temp = new ResizingArrayStack<>();
        newStack = new ResizingArrayStack<>();
        // use temp stack in order to keep an order of items
        for (Item item : stack) {
            temp.push(item);
        }
        for (Item item : temp) {
            newStack.push(item);
        }
        return newStack;
    }
}
