package Rectangle;

public class Rectangle {
    private double height;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle(double ht, double w) {
        height = ht;
        width = w;
        calculateArea();
        calculatePerimeter();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle() {
        height = 3;
        width = 2;
        calculateArea();
        calculatePerimeter();
    }

    public void calculateArea() {
        area = height * width;
    }

    public void calculatePerimeter() {
        perimeter = (height + width) * 2;
    }

    public void printResult() {
        System.out.println("Height = " + getHeight());
        System.out.println("Width = " + getWidth());
        System.out.println("The area of the rectangle = " + area);
        System.out.println("The perimeter of the rectangle = " + perimeter);
    }
}
