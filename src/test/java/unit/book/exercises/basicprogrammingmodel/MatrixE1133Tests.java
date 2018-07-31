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

        int counter = 0;
        for(int j =0; j<a[0].length; j++){
            for(int i=0; i<a.length; i++){
                a[i][j] = ++counter;
            }
        }

        for(int j =0; j<b[0].length; j++){
            for(int i=0; i<b.length; i++){
                b[i][j] = ++counter;
            }
        }

        Assert.assertEquals(58, m.multiply(b,a)[0][0], inconsiderableDifference);
        Assert.assertEquals(64, m.multiply(b,a)[1][0], inconsiderableDifference);
    }
}
