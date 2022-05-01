package If;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        if (a > b) {
            int a1 = a - b;
            a = a - a1;
            b = b + a1;
        }
        System.out.println(a + " ; " + b);
    }
}
