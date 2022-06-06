package Car;

import java.util.Scanner;

public class Car {

    Scanner sc = new Scanner(System.in);
    String modelCar = sc.next();

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public Car(String modelCar) {
        this.modelCar = modelCar;
    }

    SteeringWheel newSteeringWheel = new SteeringWheel(3,6);

    WheelCar newWheelCar = new WheelCar(34,2);

    public Car() {
    }

    @Override
    public String toString() {
        return "Car model: " + modelCar + ". " + newSteeringWheel + ". " + newWheelCar;
    }
}
