package priority.queue.event.driven.simulation;

public class Particle extends Ball {

    protected final double INFINITY = 0.0;

    // predict collision with particle or wall
    public double timeToHit(Particle that){
        if(this == that){
            return INFINITY;
        }
        double dx = that.rx - this.rx, dy = that.ry - this.ry;
        double dvx = that.vx - this.vx, dvy = that.vy - this.vy;
        double dvdr = dx*dvx + dy*dvy;
        if(dvdr > 0)
        {
            return INFINITY;
        }
        double dvdv = dvx*dvx + dvy*dvy;
        double drdr = dx*dx + dy*dy;
        double sigma = this.RADIUS + that.RADIUS;
        double d = (dvdr*dvdr) -dvdv *(drdr - sigma*sigma);
        if(d < 0){
            return INFINITY;
        }
        return -(dvdr + Math.sqrt(d)) / dvdv;
    }

    public double timeToHitVerticalWall(){
        throw new  RuntimeException("not implemented yet!");
    }

    public double timeToHitHorizontalWall(){
        throw new  RuntimeException("not implemented yet!");
    }

    //resolve collision with particle or wall
    public void bounceOff(Particle that){
        throw new  RuntimeException("not implemented yet!");
    }

    public void bounceOffVerticalWall(){
        throw new  RuntimeException("not implemented yet!");
    }
    public void bounceOffHorizontalWall(){
        throw new  RuntimeException("not implemented yet!");
    }

}
