package book.exercises.basicprogrammingmodel;

public class FilteringE1134 {


    public void printMaximumAndMinimum(double[] N) {
        sort(N);
        System.out.println("minimum:" +N[0]);
        System.out.println("maximum:" +N[N.length-1]);
    }


    private double[] sort(double[] N) {
        for (int j = 0; j < N.length; j++) {
            for (int i = 0; i < N.length - 1; i++) {
                if (N[i] > N[i + 1]) {
                    double temp = N[i];
                    N[i] = N[i + 1];
                    N[i + 1] = temp;
                }
            }
        }
        return N;
    }
}
