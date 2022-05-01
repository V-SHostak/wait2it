package Integer;

import java.util.Scanner;

public class Integer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit integer: ");
        int a = sc.nextInt();
        int tens = a / 10;
        int units = a % 10;
        System.out.println("In number " + a + " dozens = " + tens + ", units = " + units);
    }
}
