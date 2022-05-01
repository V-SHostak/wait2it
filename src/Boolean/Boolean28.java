package Boolean;

import java.util.Scanner;

public class Boolean28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter XY: ");
        System.out.print("X= ");
        int x = sc.nextInt();
        System.out.print("Y= ");
        int y = sc.nextInt();

        System.out.println("The first or third part : " + (x > 0 && y > 0 || x < 0 && y < 0));

    }
}
