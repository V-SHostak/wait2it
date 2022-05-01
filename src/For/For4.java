package For;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price 1 kilo potato: ");
        int kiloPotato = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int price = i * kiloPotato;
            System.out.print(i + " kilo = " + price + "; ");
        }
    }
}
