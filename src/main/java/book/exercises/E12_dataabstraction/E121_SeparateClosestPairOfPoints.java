package book.exercises.E12_dataabstraction;

import javafx.geometry.Point2D;

import java.util.Random;

/**
 *
 * Exercise 1.2.1:
 * Write a Point2D client that takes an integer value N from the command line,
 * generates N random points in the unit square,
 * and computes the distance separating the closest pair of points
 *
 *
 * In mathematics, a unit square is a square whose sides have length 1.
 * Often, "the" unit square refers specifically to the square in the Cartesian plane with corners at the four points (0, 0), (1, 0), (0, 1), and (1, 1).
 *
 */
public class E121_SeparateClosestPairOfPoints {

    private Random random;
    private final double FROM = 0.0;

    public E121_SeparateClosestPairOfPoints() {
        random = new Random();
    }

    public Point2D[] generateRandomPointsInTheUnitSquare(int N) {
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            double x = FROM + random.nextDouble();
            double y = FROM + random.nextDouble();
            Point2D point = new Point2D(x, y);
            points[i] = point;
        }
        return points;
    }

    /**
     * Compare each point with other points and figure out the distance
     *
     * @param points
     */
    public void calculateTheDistanceOfPoints(Point2D[] points) {
        final int FIRST_I_TICK = 0;
        final int LAST_TICK = points.length - 1;
        double resultingDistance = 0;
        Point2D resultingPoint1 = null;
        Point2D resultingPoint2 = null;
        for (int i = 0; i < points.length; i++) {
            final int FIRST_J_TICK = i + 1;
            double distance = 0;
            Point2D referencePoint = null;
            for (int j = i + 1; j < points.length; j++) {
                double hypotenuse = calculateHypotenuse(points[i], points[j]);
                if (j == FIRST_J_TICK || hypotenuse < distance) {
                    distance = hypotenuse;
                    referencePoint = points[j];
                }
                if (j == LAST_TICK && (i == FIRST_I_TICK || distance < resultingDistance)) {
                    resultingDistance = distance;
                    resultingPoint1 = points[i];
                    resultingPoint2 = referencePoint;
                }
            }
        }
        System.out.println("The closest points");
        System.out.println("Distance: " + resultingDistance);
        System.out.println("Point 1: " + resultingPoint1.getX() + " " + resultingPoint1.getY());
        System.out.println("Point 2: " + resultingPoint2.getX() + " " + resultingPoint2.getY());
    }

    private double calculateHypotenuse(Point2D point1, Point2D point2) {
        double a = Math.abs(point1.getX() - point2.getX());
        double b = Math.abs(point1.getY() - point2.getY());
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
}
