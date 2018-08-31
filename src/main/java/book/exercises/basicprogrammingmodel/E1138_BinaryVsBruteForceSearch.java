package book.exercises.basicprogrammingmodel;

public class E1138_BinaryVsBruteForceSearch {

    public int bruteForceSearch(int key, int[] a){
        for(int i = 0; i< a.length; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }
}
