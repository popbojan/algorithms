package book.exercises.E13_bagsqueuesandstacks;

import java.util.Stack;

/**
 * Exercise 1.3.2:
 * Give the output printed by java stack for the input:
 * it was - the best - of times - - - it was - the - -
 */
public class E_132_GiveTheOutputPrintedByJavaStackForTheInput<T> {

    private Stack<T> stack;

    public E_132_GiveTheOutputPrintedByJavaStackForTheInput(){
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

    public void printAllItemsInStack(){
        for(T item : stack){
            System.out.println(item);
        }
    }
}
