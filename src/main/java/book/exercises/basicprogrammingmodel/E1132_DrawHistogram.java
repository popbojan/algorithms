package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdDraw;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Got a lot of help form github olegkamuz
 * https://github.com/olegkamuz/algorithms-sedgewick-wayne/
 */
public class E1132_DrawHistogram extends Application {

    private final int ONE = 1;
    double[] stream;
    int N;
    double l;
    double r;

    /**
     * Default constructor is must have with JavaFX Application
     */
    public E1132_DrawHistogram() {
    }

    public E1132_DrawHistogram(double[] stream, int N, double l, double r) {
        this.stream = stream;
        this.N = N;
        this.l = l;
        this.r = r;
    }

    public void draw() {

        double[] intervals = getIntervals(N, l, r);
        int[] count = getCountOfNumbersThatFallInEachOfNIntervals(stream, intervals, N);
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }

        String[] args = new String[3];
        List<String> list = new ArrayList();
        args[0] = Arrays.toString(count);
        args[1] = String.valueOf(N);
        args[2] = Arrays.toString(intervals);
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
        String stringIntervals = parameters.get(2);
        stringIntervals = stringIntervals.replaceAll("^\\[|\\]$", "");
        String[] stringIntervalsA = stringIntervals.split(", ");
        double[] intervals = new double[N];
        for(int i=0; i<stringIntervalsA.length; i++){
            intervals[i] = Double.parseDouble(stringIntervalsA[i]);
        }

        drawWithStdDraw(count, N);
        drawWithBarChart(stage, count, N, intervals);
    }

    private void drawWithStdDraw(int[] count, int N) {
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

    private void drawWithBarChart(Stage stage, int[] count, int N, double[] intervals) {

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Numbers");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Counts");

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series dataSeries = new XYChart.Series();
        dataSeries.setName("Stream numbers fall in N intervals");

        for (int i = 0; i < N-1; i++) {
            dataSeries.getData().add(new XYChart.Data("From: "+ String.valueOf(intervals[i]) + " To: " +String.valueOf(intervals[i+1]), count[i]));
        }

        barChart.getData().add(dataSeries);

        VBox vbox = new VBox(barChart);

        Scene scene = new Scene(vbox, 400, 200);

        stage.setScene(scene);
        stage.setHeight(300);
        stage.setWidth(1200);
        stage.setTitle("Histogram");
        stage.show();
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
}
