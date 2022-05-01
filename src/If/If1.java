package If;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        if (a >= 0) {
            System.out.println("The number +1 : " + (a + 1));
        } else {
            System.out.println("The number: " + a);
        }

    }
}