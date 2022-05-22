package Rectangle;

public class Rectangle {
    double height;
    double width;
    double area;
    double perimeter;

    public Rectangle(double ht, double w)
    {
        height = ht;
        width = w;
        calculateArea();
        calculatePerimeter();
    }

    public Rectangle()
    {
        height = 3;
        width = 2;
        calculateArea();
        calculatePerimeter();
    }

    public void calculateArea()
    {
        area = height * width;
    }

    public void calculatePerimeter()
    {
        perimeter = (height + width)*2;
    }

    public void printResult()
    {
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
        System.out.println("The area of the rectangle = " + area);
        System.out.println("The perimeter of the rectangle = " + perimeter);
    }
}
