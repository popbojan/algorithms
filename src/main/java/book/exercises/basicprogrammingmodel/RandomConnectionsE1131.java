package book.exercises.basicprogrammingmodel;

import edu.princeton.cs.introcs.StdIn;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.List;

public class RandomConnectionsE1131 extends Application {

    int N = 5; // number of points
    int k = 2; // two points are needed for a line
    double p = 0.3; // probability


    public void connect(){
        String[] args = new String[3];
        args[0] = String.valueOf(N);
        args[1] = String.valueOf(k);
        args[2] = String.valueOf(p);
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String result = null;
        List<String> parameters = getParameters().getRaw();
        int N = Integer.parseInt(parameters.get(0));
        int k = Integer.parseInt(parameters.get(1));
        double p = Double.parseDouble(parameters.get(2));

        System.out.println(parameters);

        // Drawing a Circle
        Circle circle = new Circle(0);

        // Setting the properties of the circle
        circle.setCenterX(300);
        circle.setCenterY(150);
        circle.setRadius(50);

        Ellipse circleCircumference = new Ellipse();
        circleCircumference.setCenterX(300);
        circleCircumference.setCenterY(150);
        circleCircumference.setRadiusX(50);
        circleCircumference.setRadiusY(50);
        circleCircumference.setStrokeWidth(3);
        circleCircumference.setStroke(Color.BLACK);
        circleCircumference.setFill(null);

//        Point2D point = new Point2D();
//        point.add()
//
//        circleCircumference

        // Creating a group object
        Group root = new Group(circleCircumference);

        Point2D center = new Point2D(circleCircumference.getCenterX(), circleCircumference.getCenterY());
        Point2D[] points = getCirclePoints(2, circleCircumference.getRadiusX(), center);

//        double binomialPercentage = BinomialDistributionE1127.getBinomialPercentage(N, k, p);
        double binomialCoefficient = BinomialDistributionE1127.getBinomialCoefficientA(N, k);
        Line[] lines = getCircleLines(points, binomialCoefficient);
        for(int i=0; i<lines.length; i++){
            root.getChildren().add(lines[i]);
        }

        // Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        stage.setTitle("Drawing a circle");
        stage.setScene(scene);
        stage.show();
    }

    private Line[] getCircleLines(Point2D[] points, double binomialCoefficient){
        Line[] lines = new Line[(int) binomialCoefficient];
        for(int i=0; i< lines.length-1; i++) {
            Line line = new Line();
            line.setStartX(points[i].getX());
            line.setStartY(points[i].getY());
            line.setEndX(points[i+1].getX());
            line.setEndY(points[i+1].getY());
            lines[i] = line;
        }
        return lines;

    }

    private Point2D[] getCirclePoints(int points, double radius, Point2D center){
        double slice = 2 * Math.PI / points;
        Point2D[] pointsA = new Point2D[points];
        for(int i=0; i< points; i++){
            double angleT = slice * i;
            int newX = (int) (center.getX() + radius * Math.cos(angleT));
            int newY = (int) (center.getY() + radius * Math.sin(angleT));
            Point2D point = new Point2D(newX, newY);
            pointsA[i] = point;
            System.out.println(point);
        }
        return pointsA;
    }
}
