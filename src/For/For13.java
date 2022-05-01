package For;

import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number N>0: ");
        double n = sc.nextDouble();
        double sum =0 ;
        int c=1;

        for (double i = 1; i <= n; i++) {
            double x = (1 + i*0.1)*c;
            sum += x;
            c*=(-1);

            System.out.println(i + " = " + x);
        }
        System.out.println("Multiplication of numbers = " + sum);
    }
}