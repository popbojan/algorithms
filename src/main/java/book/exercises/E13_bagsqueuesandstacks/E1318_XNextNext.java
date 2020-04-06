package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.18:
 * Suppose x is linked-list node and not the last node on the list. What is the effect of the following code fragment?
 * x.next = x.next.next
 * Answer: Deletes from the list the node immediately following x.
 */
public class E1318_XNextNext {

    private MyLinkedList<String> myLinkedList;

    public E1318_XNextNext() {
        myLinkedList = new MyLinkedList<>();
    }

    public MyLinkedList<String> getMyLinkedList() {
        return myLinkedList;
    }
}
