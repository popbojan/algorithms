package book.exercises.basicprogrammingmodel;

public class DoublesAreBetween0And1E115 {

    public boolean areBetween0And1(double[] doubles) {

        for(int i =0; i<doubles.length; i++){
            if(doubles[i] < 0 || doubles[i] > 1){
                return false;
            }
        }
        return true;
    }
}
