package Circle;

public class Circle {

    double radius;
    double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    private double calculateArea() {
        return (diameter * diameter * Math.PI) / 4;
    }

    private double calculateLengthCircle() {
        return 2 * Math.PI * radius;
    }

    public void printResult() {
        System.out.println("Diameter = " + diameter);
        System.out.println("Radius = " + radius);
        System.out.println("The area of the circle = " + calculateArea());
        System.out.println("The length of the circle = " + calculateLengthCircle());
    }
}
