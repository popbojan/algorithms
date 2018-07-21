package unit.video.examples.priorityqueue.eventdrivensimulation;

import edu.princeton.cs.introcs.StdDraw;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import video.examples.priorityqueue.eventdrivensimulation.Ball;

public class Tests {

    @Before
    public void setup() {
    }

    @Test
    @Ignore
    public void test_bouncingBalls() {
        int N = 5;
        Ball[] balls = new Ball[N];
        for(int i = 0; i < N; i++){
            balls[i] = new Ball();
        }
        while(true)
        {
            StdDraw.clear();
            for( int i =0; i< N; i++){
                balls[i].move(0.5);
                balls[i].draw();
            }
            StdDraw.show(50);
        }
    }
}
