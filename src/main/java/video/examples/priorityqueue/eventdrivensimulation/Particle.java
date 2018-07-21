package video.examples.priorityqueue.eventdrivensimulation;

public class Particle extends Ball {

    protected final double INFINITY = 0.0;
    protected int count;

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
        double dx = that.rx - this.rx, dy = that.ry - this.ry;
        double dvx = that.vx - this.vx, dvy = that.vy - this.vy;
        double dvdr = dx*dvx + dy*dvy;
        double dist = this.RADIUS + that.RADIUS;
        double J = 2 * this.mass * that.mass * dvdr / ((this.mass + that.mass) * dist);
        double Jx = J * dx / dist;
        double Jy = J * dy / dist;
        this.vx += Jx / this.mass;
        this.vy += Jy / this.mass;
        that.vx -= Jx / that.mass;
        that.vy -= Jy / that.mass;
        this.count++;
        that.count++;
    }

    public void bounceOffVerticalWall(){
        throw new  RuntimeException("not implemented yet!");
    }
    public void bounceOffHorizontalWall(){
        throw new  RuntimeException("not implemented yet!");
    }

}
