package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.20:
 * Write a method delete() that takes an int argument k and deletes the kth element in a linked list, if it exists.
 */
public class E1320_DeleteKthElement {

    private MyLinkedList<String> linkedList;

    public E1320_DeleteKthElement() {
        linkedList = new MyLinkedList<>();
    }

    public MyLinkedList<String> getLinkedList() {
        return linkedList;
    }
}
