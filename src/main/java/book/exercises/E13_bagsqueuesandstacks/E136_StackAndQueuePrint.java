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
 *
 * Check out page 151 for Queue
 */
public class E136_StackAndQueuePrint {

    private JavaStack<String> stack;
    private MyQueue<String> queue;

    public E136_StackAndQueuePrint(){
        stack = new JavaStack<>();
        queue = new MyQueue<>();
    }

    public void pushToStack(String item){
        stack.pushToStack(item);
    }

    public void enqueueToQueue(String item){
        queue.enqueue(item);
    }

    public void print() {
        while(!queue.isEmpty()) {
            stack.pushToStack(queue.dequeue());
        }
        while(!stack.isEmpty()) {
            queue.enqueue(stack.popFromStack());
        }

        for(String item: queue){
            System.out.println(item);
        }
    }
}
