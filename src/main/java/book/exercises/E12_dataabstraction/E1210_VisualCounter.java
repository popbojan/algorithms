package book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.helper.VisualCounter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;
import java.util.Random;

/**
 * Develop a class VisualCounter that allows both increment and decrement operations.
 * Take two arguments N and max in the constructor, where N specifies the maximum number
 * of operations and max specifies the maximum absolute value for the counter. As a side
 * effect, create a plot showing the value of the counter each time its tally changes.
 */
public class E1210_VisualCounter extends Application {

    private VisualCounter visualCounter;
    private Random random;

    public E1210_VisualCounter() {
        random = new Random();
    }

    @Override
    public void start(Stage stage) throws Exception {
        List<String> parameters = getParameters().getRaw();
        int N = Integer.parseInt(parameters.get(0));
        double max = Integer.parseInt(parameters.get(1));

        visualCounter = new VisualCounter("plot", N, (int) max);

        stage.setTitle("VisualCounter");

        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Operations");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Tally");

        LineChart lineChart = new LineChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = getDataSeries(N);
        dataSeries1.setName("2019");

        lineChart.getData().add(dataSeries1);

        VBox vbox = new VBox(lineChart);

        Scene scene = new Scene(vbox, 400, 200);

        stage.setScene(scene);
        stage.setHeight(300);
        stage.setWidth(1200);

        stage.show();
    }

    public void drawTallyPlot(int N, int max) {
        String[] args = new String[2];
        args[0] = String.valueOf(N);
        args[1] = String.valueOf(max);
        launch(args);
    }

    public void printTallyPlot(int N, int max) {
        visualCounter = new VisualCounter("plot", N, max);
        for (int i = 0; i < N; i++) {
            performOperation();
            System.out.println("Tally:" + this.visualCounter.tally());
        }
    }

    private XYChart.Series getDataSeries(int N) {
        XYChart.Series dataSeries1 = new XYChart.Series();
        for (int i = 0; i < N; i++) {
            performOperation();
            dataSeries1.getData().add(new XYChart.Data(i, visualCounter.tally()));
        }
        return dataSeries1;
    }

    private void performOperation() {
        int decision = random.nextInt(2);
        switch (decision) {
            case 0:
                visualCounter.increment();
                break;
            case 1:
                visualCounter.decrement();
                break;
        }
    }
}
