package book.exercises.E12_dataabstraction;

import javafx.geometry.Point2D;

import java.util.Random;

public class E121_SeparateClosestPairOfPoints {

    private Random random;
    private final int squareEdgeLength = 300;
    private final int FROM = 0;
    private final int LIMIT = squareEdgeLength;

    public E121_SeparateClosestPairOfPoints() {
        random = new Random();
    }

    public Point2D[] generateRandomPointsInTheUnitSquare(int N) {
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++){
            int x = FROM + random.nextInt(LIMIT);
            int y = FROM + random.nextInt(LIMIT);
            Point2D point = new Point2D(x, y);
            points[i] = point;
        }
        return points;
    }

    /**
     * Compare each point with other points and figure out the distance
     * @param points
     */
    public void calculateTheDistanceOfPoints(Point2D[] points) {

    }
}
