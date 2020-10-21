package book.exercises.E13_bagsqueuesandstacks.helper;

public class DoubleLinkedList<Item> {

    private DoubleLinkedList.Node<Item> first = null;
    private DoubleLinkedList.Node<Item> last = null;
    private int N = 0;


    private static class Node<Item> {
        private Item item;
        private DoubleLinkedList.Node<Item> next;
        private Node() {
        }
    }
}