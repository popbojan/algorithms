package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdDraw;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Got a lot of help form github olegkamuz
 * https://github.com/olegkamuz/algorithms-sedgewick-wayne/
 */
public class DrawHistogramE1132 extends Application {

    private final int ONE = 1;
    double[] stream;
    int N;
    double l;
    double r;

    /**
     * Default constructor is must have with JavaFX Application
     */
    public DrawHistogramE1132() {
    }

    public DrawHistogramE1132(double[] stream, int N, double l, double r) {
        this.stream = stream;
        this.N = N;
        this.l = l;
        this.r = r;
    }

    public void draw() {

        int[] count = getCountOfNumbersThatFallInEachOfNIntervals(stream, getIntervals(N, l, r), N);
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
        String[] args = new String[2];
        List<String> list = new ArrayList();
        args[0] = Arrays.toString(count);
        args[1] = String.valueOf(N);
        launch(args);

    }

    @Override
    public void start(Stage stage) {
        List<String> parameters = getParameters().getRaw();
        String stringCount = parameters.get(0);
        int N = Integer.parseInt(parameters.get(1));
        int[] count = new int[N];
        int countIterator = 0;
        char[] charCount = stringCount.toCharArray();
        for (int i = 0; i < charCount.length; i++) {
            if (Character.isDigit(charCount[i])) {
                count[countIterator++] = Character.getNumericValue(charCount[i]);
            }
        }

        StdDraw.setPenRadius(.006);
        StdDraw.line(0, 0, 1, 0);
        StdDraw.line(0, 0, 0, 1);

        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = count[i] / 2.0;
            double halfWidth = 0.25 / N;
            double halfHeight = count[i] / 2.0;

            StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
        }
    }

    public int[] getCountOfNumbersThatFallInEachOfNIntervals(double[] stream, double[] intervals, int N) {
        int[] count = new int[N];
        for (int i = 0; i < N - 1; i++) {
            int counterPerInterval = 0;
            for (int j = 0; j < stream.length; j++) {
                if (stream[j] >= intervals[i] && stream[j] <= intervals[i + 1]) {
                    counterPerInterval++;
                }
            }
            count[i] = counterPerInterval;
        }
        return count;
    }

    public double[] getIntervals(int N, double l, double r) {
        double[] intervals = getIntervalsFrom(N, l, r);
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(intervals[i]);
        }
        return intervals;
    }

    private double[] getIntervalsFrom(int N, double l, double r) {
        double range = (l > r) ? (l - r) : (r - l);
        double rangeStart = (l > r) ? r : l;
        double steps = N - ONE; // always one less than the total amount of numbers
        double step = range / steps;
        double[] intervals = new double[N];
        intervals[0] = rangeStart;
        for (int i = 1; i < N; i++) {
            intervals[i] = rangeStart + step;
            rangeStart = intervals[i];
        }
        return intervals;
    }

    /**
     * copied form github olegkamuz
     *
     * @param countHistogram
     * @param N
     */
    private static void drawHistogram(double[] countHistogram, int N) {
        StdDraw.setCanvasSize(1024, 600);
        StdDraw.setYscale(-1.0, 7.0);
        StdDraw.setXscale(-0.1, 1.1);
        for (int j = 0; j < N; j++) {
            double x = 1.0 * j / N;
            double y = countHistogram[j] / 2.0;
            double hw = 0.25 / N;
            double hh = countHistogram[j] / 2.0;
            StdDraw.filledRectangle(x, y, hw, hh);
        }
    }
}
