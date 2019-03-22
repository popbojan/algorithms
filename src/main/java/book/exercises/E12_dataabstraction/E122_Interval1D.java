package book.exercises.E12_dataabstraction;

/**
 * Exercises: 1.2.2:
 * Write an Interval1D client that takes an int value N as command-line argument,
 * reads N intervals (each defined by a pair of double values) from standard input,
 * and prints all pairs that intersect.
 */
public class E122_Interval1D {

    final int LEFT = 0;
    final int RIGHT = 1;

    public void printPairsThatIntersect(int N, double[][] arrayOfPairs) {
        if (N > arrayOfPairs.length) {
            return;
        }

        sortPairs(arrayOfPairs);

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (doesIntersect(arrayOfPairs, i, j)) {
                    System.out.println("Intersecting pairs: {" + arrayOfPairs[i][LEFT] + ", " + arrayOfPairs[i][RIGHT]
                            + "} {" + arrayOfPairs[j][LEFT] + ", " + arrayOfPairs[j][RIGHT] + "}");
                }
            }
        }
    }

    private void sortPairs(double[][] arrayOfPairs) {
        for (int i = 0; i < arrayOfPairs.length; i++) {
            if (arrayOfPairs[i][LEFT] > arrayOfPairs[i][RIGHT]) {
                swap(arrayOfPairs, i);
            }
        }
    }

    private void swap(double[][] arrayOfPairs, int i) {
        double temp = arrayOfPairs[i][LEFT];
        arrayOfPairs[i][LEFT] = arrayOfPairs[i][RIGHT];
        arrayOfPairs[i][RIGHT] = temp;
    }

    private boolean doesIntersect(double[][] arrayOfPairs, int first, int second) {
        if (arrayOfPairs[first][RIGHT] < arrayOfPairs[second][LEFT]) {
            return false;
        } else {
            return arrayOfPairs[second][RIGHT] > arrayOfPairs[first][LEFT];
        }
    }
}
