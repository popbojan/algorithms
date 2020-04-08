package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.19:
 * Give a code fragment that removes the last node in a linked list whose first node is first.
 */
public class E1319_RemoveLastNode {

    private MyLinkedList<String> linkedList;

    public E1319_RemoveLastNode() {
        linkedList = new MyLinkedList<>();
    }

    public MyLinkedList<String> getLinkedList() {
        return linkedList;
    }
}
