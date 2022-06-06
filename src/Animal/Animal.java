package Animal;

public class Animal {
    private String name;
    private int speedAnimal;
    private int ageAnimal;

    public Animal(String name, int speedAnimal, int ageAnimal) {
        this.name = name;
        this.speedAnimal = speedAnimal;
        this.ageAnimal = ageAnimal;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getSpeedAnimal() {
        return speedAnimal;
    }

    public int setSpeedAnimal (int speedAnimal) {
        this.speedAnimal = speedAnimal;
        return speedAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public int setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
        return ageAnimal;
    }
}
