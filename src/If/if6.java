package If;

import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("A = ");
        double a = sc.nextInt();
        System.out.print("B = ");
        double b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is the larger number among " + a + " and " + b);
        } else if (b > a) {
            System.out.println(b + " is the larger number among " + a + " and " + b);
        } else{
            System.out.println("The numbers are equal ");
        }


    }
}
