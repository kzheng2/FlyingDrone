package Flying.Drone.Applicagtion;

/**
 * This class is responsible for keeping engine power and statue
 * The power has indication range from 0 to 100
 */
public class Engine {

    private boolean statues;
    private int power;

    public Engine() {
        this.statues = false;
        this.power = 0;
    }

    /**
     *
     * @return statue of engine
     */
    public boolean isStatues() {
        return statues;
    }

    /**
     *
     * @param statues set the statue of engine
     */
    public void setStatues(boolean statues) {
        this.statues = statues;
    }

    /**
     *
     * @return the power indicator of the engine
     */
    public int getPower() {
        return power;
    }

    /**
     *
     * @param power modify the power of engine
     */
    public void setPower(int power) {
        this.power = power;
    }
}
