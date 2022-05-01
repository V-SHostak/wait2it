package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int last = a.length - 1; last > 0; last--) {
            int maxId = 0;
            for (int j = 1; j <=last; j++) {
                if (a[j] > a[maxId]) {
                    maxId = j;
                }
            }

            int temp = a[maxId];
            a[maxId] = a[last];
            a[last] = temp;
            System.out.println((Arrays.toString(a)));
        }
        System.out.println((Arrays.toString(a)));
    }
}
