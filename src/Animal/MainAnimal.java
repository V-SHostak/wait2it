package Animal;

public class MainAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal("Леопард", 30, 5);

        System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeedAnimal() + " км/год, Вік тварини = " + animal.getAgeAnimal() + " років");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Назва тварини = " + animal.setName("Черепаха") + ", Швидкість тварини = " + animal.setSpeedAnimal(1) + " км/год, Вік тварини = " + animal.setAgeAnimal(1000) + " років");

    }
}
