package Car;

import java.util.Scanner;

public class CarBody {

    public CarBody(String shapeBodyCar) {
        this.shapeBodyCar = shapeBodyCar;
    }

    public CarBody() {

    }

    public String getShapeBodyCar() {
        return shapeBodyCar;
    }

    public void setShapeBodyCar(String shapeBodyCar) {
        this.shapeBodyCar = shapeBodyCar;
    }

    Scanner sc = new Scanner(System.in);
    String shapeBodyCar = sc.next();

    @Override
    public String toString() {
        return "Shape body car: " + shapeBodyCar;
    }
}
