package book.exercises.basicprogrammingmodel;

public class SortingThreeNumbersE1126 {

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
