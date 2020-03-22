package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;

/**
 * Exercise 1.3.4:
 * Write stack client Parentheses that reads in a text stream from standard input and uses a stack to determine whether its parentheses are properly balanced.
 * For example, you program should print true for [()]{}{[()()]()} and false for [(]).
 *
 * checkout page 129 in the book
 */
public class E_134_Parentheses {

    private JavaStack<String> stack;

    public E_134_Parentheses(){
        stack = new JavaStack<>();
    }

    public boolean parenthesesProperlyBalanced(String parentheses) {
        for (int i = 0; i < parentheses.length(); i++) {
            String p = String.valueOf(parentheses.charAt(i));
            if(stack.isEmpty()){
                if(p.equals("]") && p.equals(")") && p.equals("}")) {
                    return false;
                }
                else {
                    stack.pushToStack(p);
                }
            }
            if(!stack.isEmpty()) {
                if (p.equals("]")) {
                    if (!stack.popFromStack().equals("[")) {
                        return false;
                    }
                }
                else if (p.equals("}")) {
                    if (!stack.popFromStack().equals("{")) {
                        return false;
                    }
                }
                else if (p.equals(")")) {
                    if (!stack.popFromStack().equals("(")) {
                        return false;
                    }
                }
                else {
                    stack.pushToStack(p);
                }
            }
        }
        return true;
    }
}
