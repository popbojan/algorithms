package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;

/**
 * Exercise 1.3.9:
 * Write a program that takes from standard input an expression without left parentheses and prints
 * the equivalent infix expression with the parentheses inserted. For example, given the input:
 * 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
 * your program should print
 * ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
 *
 * figured last part out with multiple parentheses thanks to the reneargento:
 * https://github.com/reneargento/algorithms-sedgewick-wayne/blob/master/src/chapter1/section3/Exercise9.java
 */
public class E139_InfixParentheses {

    private JavaStack<String> operands;
    private JavaStack<String> operators;

    public E139_InfixParentheses() {
        operands = new JavaStack<>();
        operators = new JavaStack<>();
    }

    public String addLeftParentheses(String input) {

        String[] inputValues = input.split("\\s");

        for (String value : inputValues) {
            if (value.equals("(")) {
                //do nothing
            } else if (value.equals("+")
                    || value.equals("-")
                    || value.equals("*")
                    || value.equals("/")) {
                operators.pushToStack(value);
            } else if (value.equals(")")) {
                String operator = operators.popFromStack();
                String value2 = operands.popFromStack();
                String value1 = operands.popFromStack();

                String subExpression = "( " + value1 + " " + operator + " " + value2 + " )";
                operands.pushToStack(subExpression);
            } else {
                operands.pushToStack(value);
            }
        }

        String result = "";
        for (String op : operands) {
            result += op;
        }
        return result;
    }

}
