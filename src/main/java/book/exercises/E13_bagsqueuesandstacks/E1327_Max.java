package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.27:
 * Write a method max() that takes a reference to the first node in a linked list as argument and returns the value of
 * the maximum key in the list. Assume that all keys are positive integers, and return 0 if the list is empty.
 */
public class E1327_Max {

    private MyLinkedList<Integer> linkedList;

    public E1327_Max() {
        linkedList = new MyLinkedList<>();
    }

    public MyLinkedList<Integer> getLinkedList() {
        return linkedList;
    }
}