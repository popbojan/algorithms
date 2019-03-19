package book.exercises.E11_basicprogrammingmodel;

/**
 * Exercise 1.1.3:
 * Write a program that takes three integer command-line arguments and prints
 * equal if all three are equal, and not equal otherwise.
 */
public class E113_ThreeIntegersEqual {

    public boolean areEqual(int first, int second, int third) {
        if (first == second && first == third)
            return true;
        else
            return false;
    }
}
