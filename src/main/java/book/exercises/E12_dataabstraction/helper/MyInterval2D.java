package book.exercises.E12_dataabstraction.helper;

import edu.princeton.cs.algorithms.Interval1D;
import edu.princeton.cs.algorithms.Interval2D;

public class MyInterval2D extends Interval2D {

    private final Interval1D x;
    private final Interval1D y;

    /**
     * Initializes a two-dimensional interval.
     *
     * @param x the one-dimensional interval of x-coordinates
     * @param y the one-dimensional interval of y-coordinates
     */
    public MyInterval2D(Interval1D x, Interval1D y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    /**
     * Does this two-dimensional interval contain the other Interval2D
     *
     * @param i2d the two-dimensional point
     * @return true if this two-dimensional interval contains the other Interval2D i2d; false otherwise
     */
    public boolean contains(MyInterval2D i2d) {
        return this.x.contains(i2d.getX().left()) && x.contains(i2d.getX().right())
                && y.contains(i2d.getY().left()) && y.contains(i2d.getY().right());
    }

    /**
     * @return interval 1D X
     */
    public Interval1D getX() {
        return x;
    }

    /**
     * @return interval 1D Y
     */
    public Interval1D getY() {
        return y;
    }
}
