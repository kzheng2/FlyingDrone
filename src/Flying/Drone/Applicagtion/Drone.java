package Flying.Drone.Applicagtion;

public class Drone {

    private OrientationSensor sensor;
    private Gyroscope gyroscope;
    private Engine leftEngine;
    private Engine rightEngine;
    private Engine frontEngine;
    private Engine backEngine;
    private boolean flyingStatus;

    public Drone() {
        this.flyingStatus = false;
    }

    public void takeOff() {
        if(this.flyingStatus == false) {
            this.flyingStatus = true;
            //Start engine
        } else {
            System.out.println("This drone is flying and not able to take off");
        }
    }

    public void land() {
        if(this.flyingStatus == false) {
            System.out.println("This drone is not on the air and not able to land.");
        } else {
            flyingStatus = false;
            // Stabilizes and Reduce Speed Slowly
        }
    }

    public void moveForward() {

    }

    public void moveBackward() {

    }

    public void moveLeft() {

    }

    public void moveRight() {

    }

    public void stabilize() {

    }

}
