package Boolean;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cell coordinates on a chessboard XY: ");
        System.out.print("X= ");
        int x = sc.nextInt();
        System.out.print("Y= ");
        int y = sc.nextInt();

        System.out.println("This cell is white : " + ((x+y)%2!=0));

    }
}
