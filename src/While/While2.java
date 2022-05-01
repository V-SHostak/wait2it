package While;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("A = ");
        double a = sc.nextInt();
        System.out.print("B = ");
        double b = sc.nextInt();
        int n = 0;

        while (a >= b) {
            a -= b;
            n++;
        }
        System.out.println("Length of remain segment = " + a + "; Number of segments = " + n);

    }
}

