package If;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("C = ");
        int c = sc.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.println("Number A");
            } else {
                System.out.println("Number C");
            }
        } else if (b < c) {
            System.out.println("Number B");
        } else {
            System.out.println("Number C");
        }

    }
}
