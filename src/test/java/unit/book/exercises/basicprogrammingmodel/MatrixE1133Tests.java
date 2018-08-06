package unit.book.exercises.basicprogrammingmodel;

import book.exercises.basicprogrammingmodel.MatrixE1133;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixE1133Tests {

    MatrixE1133 m;

    @Before
    public void setup(){
        m = new MatrixE1133();
    }

    @Test
    public void test_dot(){
        double[] x = {2.1, 3.7, 22.9};
        double[] y = {37.2, 44.7, 12.13};
        double inconsiderableDifference = 0.1;
        Assert.assertEquals(521.287, m.dot(x, y), inconsiderableDifference);
    }

    @Test
    public void test_multiply(){
        double[][] a = new double[3][2];
        double[][] b =  new double[2][3];
        double inconsiderableDifference = 0.1;

        populateTwoDimensionalArray(a, 0);
        int lastNumberInA = (int)a[2][1];
        populateTwoDimensionalArray(b, lastNumberInA);

        Assert.assertEquals(58, m.multiply(b,a)[0][0], inconsiderableDifference);
        Assert.assertEquals(64, m.multiply(b,a)[1][0], inconsiderableDifference);
    }

    @Test
    public void test_transpose(){
        double[][] a = new double[3][2];
        double inconsiderableDifference = 0.1;
        populateTwoDimensionalArray(a, 0);

        Assert.assertEquals(6, m.transpose(a)[1][2], inconsiderableDifference);
        Assert.assertEquals(2, m.transpose(a)[0][1], inconsiderableDifference);
    }

    private void populateTwoDimensionalArray(double[][] array, int counter){
        for(int j =0; j<array[0].length; j++){
            for(int i=0; i<array.length; i++){
                array[i][j] = ++counter;
            }
        }
    }
}
