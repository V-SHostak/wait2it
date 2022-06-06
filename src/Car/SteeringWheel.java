package Car;

public class SteeringWheel {

    private int sizeSteeringWheel;
    private int changeSteeringWheel;
    private int result;

    public SteeringWheel(int sizeSteringWheel, int changeSteringWheel) {
        this.sizeSteeringWheel = sizeSteringWheel;
        this.changeSteeringWheel = changeSteringWheel;
        calculateSteeringWheel();
    }

    public int getSizeSteeringWheel() {
        return sizeSteeringWheel;
    }

    public void setSizeSteeringWheel(int sizeSteeringWheel) {
        this.sizeSteeringWheel = sizeSteeringWheel;
    }

    public int getChangeSteeringWheel() {
        return changeSteeringWheel;
    }

    public void setChangeSteeringWheel(int changeSteeringWheel) {
        this.changeSteeringWheel = changeSteeringWheel;
    }

    public void calculateSteeringWheel() {
        result = sizeSteeringWheel + changeSteeringWheel;
    }

    @Override
    public String toString() {
        return "Size steering wheel = " + result ;
    }
}
