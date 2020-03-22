package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;
import edu.princeton.cs.algs4.StdOut;

/**
 * Exercise 1.3.5:
 * What does the following code fragment print when N is 50? Give a high-level
 * description of what it does when presented with a positive integer N
 * Stack<Integer> stack = new Stack<Integer>();
 * while (N > 0)
 * {
 *     stack.push(N % 2);
 *     N = N / 2;
 * }
 * for (int d: stack) StdOut.print(d);
 * StdOut.println();
 *
 * Answer: Prints the binary representation of N (110010 when N is 50)
 */
public class E135_StackForBinaryTransformation {

    private JavaStack<Integer> stack;

    public E135_StackForBinaryTransformation(){
        stack = new JavaStack<>();
    }

    public void print(int N) {
        while(N > 0){
            stack.pushToStack(N % 2);
            N = N / 2;
        }
        while(stack.size() > 0) {
            StdOut.print(stack.popFromStack());
        }
    }
}
