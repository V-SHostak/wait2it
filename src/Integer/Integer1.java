package Integer;

import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length in santimeters l = ");
        int l = sc.nextInt();
        int m = l / 100;
        System.out.println("The length in full meters m = " + m);
    }
}
