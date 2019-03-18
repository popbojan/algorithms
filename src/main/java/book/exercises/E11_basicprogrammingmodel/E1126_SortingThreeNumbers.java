package book.exercises.E11_basicprogrammingmodel;

/**
 *
 * Exercise 1.1.26:
 * Sorting three numbers. Suppose that the variables a, b, c and t are all of the same
 * numeric primitive type. Show that the following code puts a, b, c in ascending order:
 *
 * if (a > b) { t = a; a = b; b = t; }
 * if (a > c) { t = a; a = c; c = t; }
 * if (b > c) { t = b; b = c; c = t }
 *
 */
public class E1126_SortingThreeNumbers {

    public void sort(int a, int b, int c){
        int temp;
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a > c){
            temp = a;
            a = c;
            c = temp;
        }
        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("A: ["+a+"] B: ["+b+"] C: ["+c+"]");
    }
}
