package If;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        if (a != b) {
            int c = a + b;
            a = a + c;
            b = b + c;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println(a + "; " + b);
    }
}
