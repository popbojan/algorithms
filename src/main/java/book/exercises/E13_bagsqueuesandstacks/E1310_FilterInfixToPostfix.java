package book.exercises.E13_bagsqueuesandstacks;

/**
 * Exercise 1.3.10:
 * Write a filter InfixToPostfix that converts an arithmetic expression from infix to postfix
 *
 * Check this link out:
 * https://runestone.academy/runestone/books/published/pythonds/BasicDS/InfixPrefixandPostfixExpressions.html
 *
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

    public E1310_FilterInfixToPostfix(){}
}