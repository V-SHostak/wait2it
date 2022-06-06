package Car;

public class WheelCar {

    private int sizeWheel;
    private int increaseSizeWheel;
    private int resultSizeWheel;

    public WheelCar(int sizeWheel, int increaseSizeWheel) {
        this.sizeWheel = sizeWheel;
        this.increaseSizeWheel = increaseSizeWheel;
        calculateWheelCar();
    }

    public void calculateWheelCar() {
        resultSizeWheel = sizeWheel * increaseSizeWheel;
    }

    @Override
    public String toString() {
        return "Size wheel car = " + resultSizeWheel;
    }

}
