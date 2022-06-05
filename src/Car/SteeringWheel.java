package Car;

public class SteeringWheel {
    private int sizeSteringWheel;
    private int resultSteringWheel;
    private String materialSteringWheel;

    public SteeringWheel(int sizeSteringWheel, String materialSteringWheel) {
        this.sizeSteringWheel = sizeSteringWheel;
        this.materialSteringWheel = materialSteringWheel;
    }

    public SteeringWheel() {

    }

    public int getSizeSteringWheel() {
        return sizeSteringWheel;
    }

    public void setSizeSteringWheel(int sizeSteringWheel) {
        this.sizeSteringWheel = sizeSteringWheel;
    }

    public String getMaterialSteringWheel() {
        return materialSteringWheel;
    }

    public void setMaterialSteringWheel(String materialSteringWheel) {
        this.materialSteringWheel = materialSteringWheel;
    }

    public void changeSize(int sizeSteringWheel){
        resultSteringWheel = sizeSteringWheel + 5;
        System.out.println("Size stering wheel " + resultSteringWheel + " centimeters");
    }

}
