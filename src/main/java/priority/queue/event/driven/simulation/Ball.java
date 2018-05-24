package priority.queue.event.driven.simulation;

import edu.princeton.cs.introcs.StdDraw;

public class Ball {

    protected double rx, ry; //position
    protected double vx, vy; //velocity
    protected final double RADIUS = 10; //RADIUS

    public Ball() {
    }

    public Ball(double rx, double ry, double vx, double vy) {
        this.rx = rx;
        this.ry = ry;
        this.vx = vx;
        this.vy = vy;
    }

    public void move(double dt) {
        if ((rx + vx * dt < RADIUS) || (rx + vx * dt > 1.0 - RADIUS)) {
            vx = -vx;
        }
        if ((ry + vy * dt < RADIUS) || (ry + vy * dt > 1.0 - RADIUS)) {
            vy = -vy;
        }
        rx = rx + vx * dt;
        ry = ry + vy * dt;
    }

    public void draw() {
        StdDraw.filledCircle(rx, ry, RADIUS);
    }
}
