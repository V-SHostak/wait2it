package For;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price 1 kilo candy: ");
        int kiloCandy = sc.nextInt();

        for (double i = 1.2; i <= 2; i+=0.2) {
            double price = i * kiloCandy;
            System.out.print(String.format("%.1f", i) + " kilo = " + String.format("%.2f", price) + "; ");
        }
    }
}