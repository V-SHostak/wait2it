package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();

        int[] array = new int[n];
        array[0]=a;


        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1]+d;
        }
        System.out.println(Arrays.toString(array));

    }
}
