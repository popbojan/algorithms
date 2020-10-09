package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.CircularLinkedList;

/**
 *  Exercise 1.3.29:
 *  Write a Queue implementation that uses a circular linked list, which is the same as a linked list
 *  except that no links are null and the value of last.next is first whenever the list is not empty.
 *  Keep only one Node instance variable (last).
 */
public class E1329_QueueCircularLinkedList {

    private CircularLinkedList<String> circularLinkedList;

    public E1329_QueueCircularLinkedList() {
        circularLinkedList = new CircularLinkedList<>();
    }

    public CircularLinkedList<String> getCircularLinkedList() {
        return circularLinkedList;
    }
}
