package Car;

public class SteeringWheel {

    private double diameter;

    public SteeringWheel(Double diameter) {
        this.diameter = diameter;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public void changeDiameter() {
        this.diameter = diameter*1.1;
        System.out.println("New diameter is: " + getDiameter());
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                '}';
    }
}
