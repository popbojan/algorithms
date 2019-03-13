package book.exercises.basicprogrammingmodel._11;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.List;

public class E1131_RandomConnections extends Application {

    int N;
    int k;
    double p;

    public E1131_RandomConnections() {
        N = 27;
        k = 2;
        p = 0.3;
    }

    public void connect(int N, int k, double p) {
        String[] args = new String[3];
        args[0] = String.valueOf(N);
        args[1] = String.valueOf(k);
        args[2] = String.valueOf(p);
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        List<String> parameters = getParameters().getRaw();
        int N = Integer.parseInt(parameters.get(0));
        int k = Integer.parseInt(parameters.get(1));
        double p = Double.parseDouble(parameters.get(2));

        Ellipse circleCircumference = new Ellipse();
        circleCircumference.setCenterX(300);
        circleCircumference.setCenterY(300);
        circleCircumference.setRadiusX(200);
        circleCircumference.setRadiusY(200);
        circleCircumference.setStrokeWidth(3);
        circleCircumference.setStroke(Color.BLACK);
        circleCircumference.setFill(null);

        Group root = new Group(circleCircumference);

        Point2D center = new Point2D(circleCircumference.getCenterX(), circleCircumference.getCenterY());
        Point2D[] points = getCirclePoints(N, circleCircumference.getRadiusX(), center);

        double binomialCoefficient = E1127_BinomialDistribution.getBinomialCoefficientA(N, k);
        Line[] lines = getCircleLines(points, binomialCoefficient);
        for (int i = 0; i < lines.length; i++) {
            root.getChildren().add(lines[i]);
        }

        Scene scene = new Scene(root, 600, 600);

        stage.setTitle("Drawing a circle");
        stage.setScene(scene);
        stage.show();
    }

    private Line[] getCircleLines(Point2D[] points, double binomialCoefficient) {
        Line[] lines = new Line[(int) binomialCoefficient];
        int linesIterator = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Line line = new Line();
                line.setStartX(points[i].getX());
                line.setStartY(points[i].getY());
                line.setEndX(points[j].getX());
                line.setEndY(points[j].getY());
                lines[linesIterator++] = line;
            }
        }
        return lines;

    }

    private Point2D[] getCirclePoints(int points, double radius, Point2D center) {
        double slice = 2 * Math.PI / points;
        Point2D[] pointsA = new Point2D[points];
        for (int i = 0; i < points; i++) {
            double angleT = slice * i;
            int newX = (int) (center.getX() + radius * Math.cos(angleT));
            int newY = (int) (center.getY() + radius * Math.sin(angleT));
            Point2D point = new Point2D(newX, newY);
            pointsA[i] = point;
//            System.out.println(point);
        }
        return pointsA;
    }
}
