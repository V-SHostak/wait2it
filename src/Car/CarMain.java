package Car;

public class CarMain {

    public static void main(String[] args) {

        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.changeSize(5);

        WheelCar wheelCar = new WheelCar();
        wheelCar.sizeWheel(12, 2);

        System.out.println();

    }
}
