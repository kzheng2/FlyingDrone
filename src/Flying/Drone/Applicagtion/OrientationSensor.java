package Flying.Drone.Applicagtion;

public class OrientationSensor {

    private int pitch;
    private int roll;

    public OrientationSensor() {
        this.pitch = 0;
        this.roll = 0;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
