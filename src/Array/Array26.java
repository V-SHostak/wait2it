package Array;

import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int wrongId = -1;

        int mod = array[0] % 2;
        for (int i = 0; i < array.length; i = 1 + 2) {
            if (array[i] % 2 != mod) {
                wrongId = i;
                break;
            }
        }

        int wrongId2 = -1;
        mod = Math.abs(mod - 1);
        for (int i = 1; i < array.length; i = i + 2) {
            if (array[i] % 2 != mod) {
                wrongId2 = 1;
                break;
            }
        }
        if (wrongId == -1 && wrongId2 == -1) {
            System.out.println(0);
        } else {
            System.out.println(Math.min(wrongId, wrongId2));
        }

    }
}
