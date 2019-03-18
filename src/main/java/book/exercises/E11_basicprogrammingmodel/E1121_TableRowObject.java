package book.exercises.E11_basicprogrammingmodel;

/**
 *
 * Exercise 1.1.21:
 * Write a program that reads in lines from standard input with each line containing
 * a name and two integers and then uses printf() to print a table with a column of
 * the names, the integers, and the result of dividing the first by the second, accurate
 * to three decimal places. You could use a program like this to tabulate batting averages
 * for baseball players or grades for students.
 *
 */
public class E1121_TableRowObject {

    String name;
    int a;
    int b;

    public E1121_TableRowObject(String name, int a, int b){
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getName() {
        return name;
    }
}
