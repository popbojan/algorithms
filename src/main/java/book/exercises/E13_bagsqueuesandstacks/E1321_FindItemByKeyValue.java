package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.21:
 * Write a method find() that takes a linked list and a string key as arguments and returns true
 * if some node in the list has key and its item field, false otherwise.
 */
public class E1321_FindItemByKeyValue {

    private MyLinkedList<String> linkedList;

    public E1321_FindItemByKeyValue() {
        linkedList = new MyLinkedList();
    }

    public MyLinkedList<String> getLinkedList() {
        return linkedList;
    }
}
