package book.exercises.E11_basicprogrammingmodel;

/**
 *
 * Exercise 1.1.5:
 * Write a code fragment that prints true if the double variables x and y are both
 * strictly between 0 and 1 and false otherwise.
 *
 */
public class E115_DoublesAreBetween0And1 {

    public boolean areBetween0And1(double[] doubles) {

        for(int i =0; i<doubles.length; i++){
            if(doubles[i] < 0 || doubles[i] > 1){
                return false;
            }
        }
        return true;
    }
}
