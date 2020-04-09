package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.MyLinkedList;

/**
 * Exercise 1.3.23:
 * Why does the following code fragment not do the same thing as in the previous question?
 * x.next = t;
 * t.next = x.next
 * <p>
 * Answer: When it comes time to update t.next .next is no longer the original node following x,
 * but is instead t itself!
 */
public class E1323_PointToItself {

    private MyLinkedList<String> linkedList;

    public E1323_PointToItself() {
        linkedList = new MyLinkedList<>();
    }

    public MyLinkedList<String> getLinkedList() {
        return linkedList;
    }
}
