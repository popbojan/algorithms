package book.exercises.basicprogrammingmodel;

public class DiceSimulation {

    final int SIDES = 6;

    public void diceIt(){
        double[] dist  = new double[2*SIDES+1];
        for(int i = 1; i <= SIDES; i++){
            for(int j =1; j <= SIDES; j++){
                dist[i+j] += 1.0;
            }
        }

        printIt(dist);

        for(int k = 2; k <= 2*SIDES; k++){
            dist[k] /= 36;
        }

        printIt(dist);
    }

    private void printIt(double[] a){
        for(int k = 2; k <= 2*SIDES; k++){
            System.out.println(a[k]);
        }
    }
}
