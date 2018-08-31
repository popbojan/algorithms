package book.exercises.basicprogrammingmodel;

public class E1133_Matrix {

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
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public double[][] transpose(double[][] a) {
        double[][] result = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
                System.out.println(a[i][j]);
            }
        }
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[0].length; j++) {
//                System.out.println(result[i][j]);
//            }
//        }

        return result;
    }

    /**
     * Multiply matrix by vector doing the Dot Product of columns and vector(rows)
     * each column value is multiplied by row fellow (it's own vector pair)
     */
    public double[] multiply(double[][] a, double[] x) {
        if (a == null || x == null || a.length == 0 || x.length == 0 || a.length != x.length) {
            throw new IllegalArgumentException("No way in hell!");
        }
        double[] result = new double[a.length];
        for (int row = 0; row < a[0].length; row++) {
            for (int column = 0; column < a.length; column++) {
                System.out.println(a[column][row]);
                result[row] += a[column][row] * x[column];
            }
        }
        return result;
    }

    /**
     * Multiply vector by matrix doing the Dot Product of vector(rows) and columns
     * each column value is multiplied by row fellow (it's own vector pair)
     */
    public double[] multiply(double[] x, double[][] a) {
        if (a == null || x == null || a.length == 0 || x.length == 0 || a.length != x.length) {
            throw new IllegalArgumentException("No way in hell!");
        }
        double[] result = new double[a.length];
        for (int row = 0; row < a[0].length; row++) {
            for (int column = 0; column < x.length; column++) {
                System.out.println(a[column][row]);
                result[row] += a[column][row] * x[column];
            }
        }
        return result;
    }
}
