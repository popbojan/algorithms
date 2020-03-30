package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.JavaStack;

/**
 * Exercise 1.3.11:
 * Write a program EvaluatePostfix that takes a postfix expression from standard input, evaluates it, and prints the value.
 * Piping the output of your program from the previous exercise to this program gives equivalent behaviour to Evaluate.
 */
public class E1311_EvaluatePostfix {

    private JavaStack<Double> operands;

    public E1311_EvaluatePostfix() {
        operands = new JavaStack<>();
    }

    public double evaluate(String inputExpression) {

        String[] inputValues = inputExpression.split("\\s");

        for (String value : inputValues) {
            if (value.equals("+")
                    || value.equals("-")
                    || value.equals("*")
                    || value.equals("/")) {
                double value2 = operands.popFromStack();
                double value1 = operands.popFromStack();
                double calculation = 0;
                if (value.equals("+")) {
                    calculation = value1 + value2;
                }
                if (value.equals("-")) {
                    calculation = value1 - value2;
                }
                if (value.equals("*")) {
                    calculation = value1 * value2;
                }
                if (value.equals("/")) {
                    calculation = value1 / value2;
                }
                operands.pushToStack(calculation);
            } else {
                operands.pushToStack(Double.parseDouble(value));
            }
        }

        return operands.popFromStack();
    }
}
