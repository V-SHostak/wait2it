package Car;

public class Car {
    Integer age;
    String model;
    CarBody carBody;
    SteeringWheel steeringWheel;
    WheelCar wheelCar;

    public Car(Integer age, String model, CarBody carBody, SteeringWheel steeringWheel, WheelCar wheelCar) {
        this.age = age;
        this.model = model;
        this.carBody = carBody;
        this.steeringWheel = steeringWheel;
        this.wheelCar = wheelCar;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public WheelCar getWheelCar() {
        return wheelCar;
    }

    public void setWheelCar(WheelCar wheelCar) {
        this.wheelCar = wheelCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", model='" + model + '\'' +
                ", carBody=" + carBody +
                ", steeringWheel=" + steeringWheel +
                ", wheelCar=" + wheelCar +
                '}';
    }
}
