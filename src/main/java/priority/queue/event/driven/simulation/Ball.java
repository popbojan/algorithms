package priority.queue.event.driven.simulation;

import edu.princeton.cs.introcs.StdDraw;

public class Ball {

    private double rx, ry; //position
    private double vx, vy; //velocity
    private final double radius = 10; //radius

    public Ball() {
    }

    public Ball(double rx, double ry, double vx, double vy) {
        this.rx = rx;
        this.ry = ry;
        this.vx = vx;
        this.vy = vy;
    }

    public void move(double dt) {
        if ((rx + vx * dt < radius) || (rx + vx * dt > 1.0 - radius)) {
            vx = -vx;
        }
        if ((ry + vy * dt < radius) || (ry + vy * dt > 1.0 - radius)) {
            vy = -vy;
        }
        rx = rx + vx * dt;
        ry = ry + vy * dt;
    }

    public void draw() {
        StdDraw.filledCircle(rx, ry, radius);
    }
}
