package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;
import book.exercises.E13_bagsqueuesandstacks.helper.MyQueue;

/**
 * Exercise 1.3.6:
 * What does the following fragment do to the queue q?
 * Stack<String> stack = new Stack<String>();
 * while(!q.isEmpty())
 * stack.push(q.dequeue());
 * while(!stack.isEmpty())
 * q.enqueue(stack.pop());
 */
public class E136_StackAndQueuePrint {

    private JavaStack<String> stack;
    private MyQueue<String> queue;

    public E136_StackAndQueuePrint(){
        stack = new JavaStack<>();
        queue = new MyQueue<>();
    }

    public void print() {
        while(!queue.isEmpty())
        stack.pushToStack(queue.dequeue());
        while(!stack.isEmpty())
        queue.enqueue(stack.popFromStack());
    }
}
