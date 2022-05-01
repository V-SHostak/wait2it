package Series;

import java.util.Scanner;

public class Series4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n = sc.nextInt();
        double sum = 0;
        double mult = 1;
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            double num = sc.nextDouble();
            sum += num;
            mult *= num;
        }
        System.out.println("The sum of numbers: " + sum);
        System.out.println("The multiply of numbers: " + mult);

    }
}
