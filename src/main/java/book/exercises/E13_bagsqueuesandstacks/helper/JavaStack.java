package book.exercises.E13_bagsqueuesandstacks.helper;

import java.util.Stack;

public class JavaStack<T> {

    private Stack<T> stack;

    public JavaStack() {
        stack = new Stack<>();
    }

    public void pushToStack(T item){
        stack.push(item);
    }

    public T popFromStack() {
        return stack.pop();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printAllItemsInStack(){
        for(T item : stack){
            System.out.println(item);
        }
    }
}
