package Car;

public class WheelCar {

    private int increaseSizeWheel;
    private int sizeWheel;

    public WheelCar(int increaseSizeWheel, int sizeWheel) {
        this.increaseSizeWheel = increaseSizeWheel;
        this.sizeWheel = sizeWheel;
    }

    public WheelCar() {

    }

    public int getSizeWheel() {
        return sizeWheel;
    }

    public void setSizeWheel(int sizeWheel) {
        this.sizeWheel = sizeWheel;
    }

    @Override
    public String toString() {
        return "WheelCar{" +
                "sizeWheel=" + sizeWheel +
                '}';
    }

    public WheelCar(int sizeWheel) {
        this.sizeWheel = sizeWheel;
    }

    static int sizeWheel(int sizeWheel, int increaseSizeWheel){
        int resultSizeWheel = sizeWheel*increaseSizeWheel;

       return resultSizeWheel;
    }

}
