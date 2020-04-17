package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.26:
 * Write a method remove() that takes a linked list and a string key as arguments
 * and removes all of the nodes in the list that have key as its item field.
 */
public class E1326_RemoveAllOccurrencesOfTheKey {

    private MyLinkedList<String> linkedList;

    public E1326_RemoveAllOccurrencesOfTheKey() {
        linkedList = new MyLinkedList<>();
    }

    public MyLinkedList<String> getLinkedList() {
        return linkedList;
    }
}
