package book.exercises.basicprogrammingmodel;

public class MatrixE1133 {

    /**
     * Calculate (scalar) Dot Product from a vector
     */
    public double dot(double[] x, double[] y) {
        if (x == null || y == null || x.length != y.length) {
            throw new IllegalArgumentException("Arrays should have the same amounts of items" +
                    "and shouldn't be equal null");
        }
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i] * y[i];
        }
        return result;
    }

    /**
     * Multiply matrix by another matrix doing the Dot Product of columns and rows
     * each column is multiplied by each row
     */
    public double[][] multiply(double[][] a, double[][] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length != b[0].length) {
            throw new IllegalArgumentException("No way in hell!");
        }
        double[][] result = new double[a.length][b[0].length];
        for (int i = 0; i< a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
