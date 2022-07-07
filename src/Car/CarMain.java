package Car;

public class CarMain {

    public static void main(String[] args) {

        CarBody carBody = new CarBody("white", "cupe");
        SteeringWheel steeringWheel = new SteeringWheel(40.0);
        WheelCar wheels = new WheelCar(80, "snow");

        Car car1 = new Car(5,"Daewoo", carBody, steeringWheel, wheels);

        System.out.println(car1);

        carBody.setColor("red");
        steeringWheel.setDiameter(50.0);
        wheels.setType("summer");

        System.out.println(car1);
        car1.getSteeringWheel().changeDiameter();
    }
}
