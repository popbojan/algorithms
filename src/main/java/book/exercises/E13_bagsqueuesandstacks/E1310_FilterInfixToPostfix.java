package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;

/**
 * Exercise 1.3.10:
 * Write a filter InfixToPostfix that converts an arithmetic expression from infix to postfix
 * <p>
 * Check this link out:
 * https://runestone.academy/runestone/books/published/pythonds/BasicDS/InfixPrefixandPostfixExpressions.html
 * <p>
 * Infix -> Prefix -> Postfix Examples:
 * infix -> A + B                     prefix -> + A B               postfix -> A B +
 * infix -> A + B * C                 prefix -> + A * B C           postfix -> A B C * +
 * infix -> A + B * C + D             prefix -> + + A * B C D       postfix -> A B C * + D +
 * infix -> (A + B) * (C + D)         prefix -> * + A B + C D       postfix -> A B + C D + *
 * infix -> A * B + C * D             prefix -> + * A B * C D       postfix -> A B * C D * +
 * infix -> A + B + C + D             prefix -> + + + A B C D       postfix -> A B + C + D +
 * infix -> ( ( 1 + 2 ) * ( 4 / 2 ) ) prefix -> ?                   postfix -> 1 2 + 4 2 / *
 */
public class E1310_FilterInfixToPostfix {

    private JavaStack<String> operands;
    private JavaStack<String> operators;

    public E1310_FilterInfixToPostfix() {
        operands = new JavaStack<>();
        operators = new JavaStack<>();
    }

    /**
     * handles only parenthesized infix expression
     *
     * @param inputExpression
     * @return postfix expression
     */
    public String infixToPostfix(String inputExpression) {

        String[] inputValues = inputExpression.split("\\s");

        for (String value : inputValues) {
            if (value.equals("(")) {

            } else if (value.equals("+")
                    || value.equals("-")
                    || value.equals("*")
                    || value.equals("/")) {
                operators.pushToStack(value);
            } else if (value.equals(")")) {
                String operator = operators.popFromStack();
                String value2 = operands.popFromStack();
                String value1 = operands.popFromStack();

                operands.pushToStack(value1 + " " + value2 + " " + operator);

            } else {
                operands.pushToStack(value);
            }
        }

        String result = "";
        for (String operand : operands) {
            result += operand;
        }

        return result;
    }
}