package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.24:
 * Write a method removeAfter() that takes a linked-list Node as argument and removes the node following the given one
 * (and does nothing if the argument or the nex field in the argument node is null).
 */
public class E1324_RemoveAfter {

    private MyLinkedList<String> linkedList;

    public E1324_RemoveAfter() {
        linkedList = new MyLinkedList<>();
    }

    public MyLinkedList<String> getLinkedList() {
        return linkedList;
    }
}
