package Array;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count: " + count);

    }
}
