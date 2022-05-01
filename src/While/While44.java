package While;

import java.util.Scanner;

public class While44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N (N>0) ");
        System.out.print("N = ");
        int n = sc.nextInt();
        int st = 1;

        while (n % 3 == 0) {
            n = n / 3;
        }
        System.out.println(n == 1);
        System.out.println(n == 2);


    }
}
