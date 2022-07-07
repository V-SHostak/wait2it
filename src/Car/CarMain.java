package Car;

public class CarMain {

    public static void main(String[] args) {

        SteeringWheel steeringWheel = new SteeringWheel(32, 3);
        System.out.println(steeringWheel);

        WheelCar resultWheelCar = new WheelCar(12,2);
        System.out.println(resultWheelCar);

        System.out.println("-------------------------");

        System.out.println("Enter model car: ");
        Car newCar = new Car();
        System.out.println(newCar);
        System.out.println("Body car: ");
        CarBody newCarBody = new CarBody();
        System.out.println(newCarBody);

    }
}
