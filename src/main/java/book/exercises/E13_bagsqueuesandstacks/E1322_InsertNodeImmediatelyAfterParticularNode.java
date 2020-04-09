package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.21:
 * Suppose that x is a linked list Node. What does the following code fragment do?
 * t.next = x.next;
 * x.next = t;
 * <p>
 * Answer: Inserts node t immediately after node x.
 */
public class E1322_InsertNodeImmediatelyAfterParticularNode {

    private MyLinkedList<String> linkedList;

    public E1322_InsertNodeImmediatelyAfterParticularNode() {
        linkedList = new MyLinkedList();
    }

    public MyLinkedList<String> getLinkedList() {
        return linkedList;
    }
}
