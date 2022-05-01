package Case;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        System.out.println("Enter number of month");
        System.out.print("M = ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        switch (m){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days in the month");
                break;
            case 2:
                System.out.println("28 days in this month");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days in this month");
            default:
                System.out.println("Error, the number M must be between 1-12");
        }
    }
}
