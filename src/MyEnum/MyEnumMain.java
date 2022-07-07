package MyEnum;

public class MyEnumMain {
    public static void main(String[] args) {
        for (Laptop laptop : Laptop.values()) {
            if (laptop.videoCardLaptop()) {
                System.out.print("Laptop name: " + laptop.name() + " | " + "sequence number: " + laptop.ordinal() + " | " + "Video card: " + laptop.videoCard + " | " + " Ram: ");
                laptop.getRam();
                System.out.println("-----------------------------------------------------");
            } else {
                System.out.print("Laptop name: " + laptop.name() + " | " + "sequence number: " + laptop.ordinal() + " | " + "Video card: " + laptop.videoCard + " | " + " Ram: ");
                laptop.getRam();
                System.out.println("-----------------------------------------------------");
            }
        }
    }
}
