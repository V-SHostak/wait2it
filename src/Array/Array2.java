package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N number: ");
        int n = sc.nextInt();
        int i2 = 1;

        int [] myArray = new int[10];
        for (int i=1; i<n; ++i){
            myArray[0]=2;
            myArray[i] = myArray[i - 1] * 2;
        }

        for (int i=0; i<n ; ++i) {
            System.out.println(i + ": " + myArray[i]);
        }
    }
}