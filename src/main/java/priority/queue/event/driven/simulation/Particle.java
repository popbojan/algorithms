package priority.queue.event.driven.simulation;

public class Particle extends Ball {

    // predict collision with particle or wall
    public double timeToHit(Particle that){
        throw new  RuntimeException("not implemented yet!");
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
