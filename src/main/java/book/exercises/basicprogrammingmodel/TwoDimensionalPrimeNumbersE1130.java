package book.exercises.basicprogrammingmodel;

public class TwoDimensionalPrimeNumbersE1130 {

    private final int LENGTH = 10;

    public void printIt() {

        for (int i = 1; i < LENGTH; i++) {
            for (int j = 1; j < LENGTH; j++) {
                System.out.println("i:["+i+"] j:["+j+"] is prime:["+ getTwoDimensionalPrimeSchema()[i][j]+"]");
            }
        }
    }

    private boolean[][] getTwoDimensionalPrimeSchema() {
        boolean[][] schema = new boolean[LENGTH][LENGTH];
        for (int i = 1; i < LENGTH; i++) {
            for (int j = 1; j < LENGTH; j++) {
                schema[i][j] = CommonDivisorByEuclidE1124.getCommonDivisor(i, j) > 1 ? false : true;
            }
        }

        return schema;
    }
}
