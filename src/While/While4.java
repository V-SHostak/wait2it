package While;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N (N>0) ");
        System.out.print("N = ");
        int n = sc.nextInt();
        int st = 1;

        while (st < n) {
            st = st * 3;
        }
        System.out.println(st==n);

    }
}
