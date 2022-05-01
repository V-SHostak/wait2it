package For;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number N>0: ");
        double n = sc.nextDouble();
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            double x = 1 / i;
            sum += x;
            System.out.println("1/" + String.format("%.0f", i) + " = " + x);
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
