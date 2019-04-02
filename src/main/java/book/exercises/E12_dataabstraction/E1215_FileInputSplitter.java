package book.exercises.E12_dataabstraction;

/**
 * Exercise 1.2.15:
 * File input. Develop a possible implementation of the static readInts() method from
 * In (which we use for various test clients, such as binary search on page 47) that is
 * based on the split() method in String
 * <p>
 * Solution:
 * public static int[] readInts(String name){
 * In in = new In(name);
 * String input = Stdin.readAll();
 * String[] words = input.split("\\s+");
 * int[] ints = new int[words.length];
 * for (int i = 0; i < words.length; i++){
 * ints[i] = Integer.parseInt(words[i]);
 * }
 * return ints;
 * }
 */
public class E1215_FileInputSplitter {

    public int[] splitIntsFromString(String input) {
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }
}
