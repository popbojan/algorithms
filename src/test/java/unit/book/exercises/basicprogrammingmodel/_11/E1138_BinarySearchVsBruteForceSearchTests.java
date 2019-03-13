package unit.book.exercises.basicprogrammingmodel._11;

import book.exercises.basicprogrammingmodel._11.E1138_BinarySearchVsBruteForceSearch;
import org.junit.Before;
import org.junit.Test;

public class E1138_BinarySearchVsBruteForceSearchTests {

    private E1138_BinarySearchVsBruteForceSearch bsvbfs;
    private int[] a;
    private final int LENGTH = 1000000;
    private final int KEY = 228650;

    @Before
    public void setup(){
        bsvbfs = new E1138_BinarySearchVsBruteForceSearch();
        a = new int[LENGTH];
    }

    @Test
    public void test_bruteForece(){
        bsvbfs.bruteForceSearch(KEY, a);
    }

    @Test
    public void test_binarySearch(){
        bsvbfs.rank(KEY, a);
    }
}
