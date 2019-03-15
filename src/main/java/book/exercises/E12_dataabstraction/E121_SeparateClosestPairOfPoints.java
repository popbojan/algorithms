package book.exercises.E12_dataabstraction;

import javafx.geometry.Point2D;

import java.util.Random;

/**
 * In mathematics, a unit square is a square whose sides have length 1.
 * Often, "the" unit square refers specifically to the square in the Cartesian plane with corners at the four points (0, 0), (1, 0), (0, 1), and (1, 1).
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
        for (int i = 0; i < points.length; i++) {
            //double[][] pointDistances = new double[points.length - 1][2];
            double theSmallestXDistance = 0.0;
            double theSmallestYDistance = 0.0;
            for (int j = i + 1; j < points.length; j++) {
                // compare and save the closest

                // I need a point with the smallest (x and y) distance

                double xDistance = Math.abs(points[i].getX() - points[j].getX());
                double yDistance = Math.abs(points[i].getY() - points[j].getY());
                if(j == 1) { // first tick
                    theSmallestXDistance = xDistance;
                    theSmallestYDistance = yDistance;
                }
                if(xDistance < theSmallestXDistance){
                    theSmallestXDistance = xDistance;
                }
                if(yDistance < theSmallestYDistance)
                {
                    theSmallestYDistance = xDistance;
                }

//                pointDistances[j - 1][0] = xDistance;
//                pointDistances[j - 1][1] = yDistance;
            }
//            calculateTheClosestPair(pointDistances);
        }
    }

//    private void calculateTheClosestPair(double[][] pairs){
//        for()
//    }
}
