package If;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Two variables of integer type");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();

        if (a > b) {
            b = a;
        } else if (b > a) {
            a = b;

        } else {
            a = 0;
            b = 0;
        }
        System.out.println("A = " + a + "; B = " + b);
    }
}
