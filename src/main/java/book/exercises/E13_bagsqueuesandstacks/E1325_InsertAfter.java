package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.25:
 * Write a method insertAfter() that takes two linked-list Node arguments and inserts the second
 * after the first on its list (and does nothing if either argument is null).
 */
public class E1325_InsertAfter {

    private MyLinkedList<String> linkedList;

    public E1325_InsertAfter() {
        linkedList = new MyLinkedList<>();
    }

    public MyLinkedList<String> getLinkedList() {
        return linkedList;
    }
}
