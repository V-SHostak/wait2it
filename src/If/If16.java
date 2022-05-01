package If;

import java.util.Scanner;

public class If16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.print("A = ");
        double a = sc.nextInt();
        System.out.print("B = ");
        double b = sc.nextInt();
        System.out.print("C = ");
        double c = sc.nextInt();

        if (a < b && b < c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
            System.out.println("Numbers: " + "; A = " + a + "; B = " + b + "; B = " + c);
        } else {
            a = -1 * a;
            b = -1 * b;
            c = -1 * c;
            System.out.println("Numbers: " + "; A = " + a + "; B = " + b + "; B = " + c);
        }
    }

}
