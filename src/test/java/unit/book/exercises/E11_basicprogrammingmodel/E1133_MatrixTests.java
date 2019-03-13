package unit.book.exercises.E11_basicprogrammingmodel;

import book.exercises.E11_basicprogrammingmodel.E1133_Matrix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class E1133_MatrixTests {

    E1133_Matrix m;
    final double INCONSIDERABLE_DIFFERENCE = 0.1;

    @Before
    public void setup() {
        m = new E1133_Matrix();
    }

    @Test
    public void test_dot() {
        double[] x = {2.1, 3.7, 22.9};
        double[] y = {37.2, 44.7, 12.13};
        Assert.assertEquals(521.287, m.dot(x, y), INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_multiply() {
        double[][] a = new double[3][2];
        double[][] b = new double[2][3];

        populateTwoDimensionalArray(a, 0);
        int lastNumberInA = (int) a[2][1];
        populateTwoDimensionalArray(b, lastNumberInA);

        Assert.assertEquals(58, m.multiply(b, a)[0][0], INCONSIDERABLE_DIFFERENCE);
        Assert.assertEquals(64, m.multiply(b, a)[1][0], INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_transpose() {
        double[][] a = new double[3][2];
        populateTwoDimensionalArray(a, 0);

        Assert.assertEquals(6, m.transpose(a)[1][2], INCONSIDERABLE_DIFFERENCE);
        Assert.assertEquals(2, m.transpose(a)[0][1], INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_multiplyMatrixVectorProduct() {
        double[][] a = new double[3][2];
        populateTwoDimensionalArray(a, 0);
        double[] x = {2.1, 3.7, 22.9};

        Assert.assertEquals(78.2, m.multiply(a, x)[0], INCONSIDERABLE_DIFFERENCE);
        Assert.assertEquals(164.3, m.multiply(a, x)[1], INCONSIDERABLE_DIFFERENCE);
    }

    @Test
    public void test_multiplyVectorMatrixProduct() {
        double[] x = {2.1, 3.7, 22.9};
        double[][] a = new double[3][2];
        populateTwoDimensionalArray(a, 0);

        Assert.assertEquals(78.2, m.multiply(x, a)[0], INCONSIDERABLE_DIFFERENCE);
        Assert.assertEquals(164.3, m.multiply(x, a)[1], INCONSIDERABLE_DIFFERENCE);
    }


    private void populateTwoDimensionalArray(double[][] array, int counter) {
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                array[i][j] = ++counter;
            }
        }
    }
}
