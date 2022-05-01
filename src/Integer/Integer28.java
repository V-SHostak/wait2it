package Integer;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day 1-365: ");
        int k = sc.nextInt();
        System.out.print("Enter number of day 1-7: ");
        int n = sc.nextInt();
        int day = (k + n) % 7;
        System.out.println("Day of the week: " + day);
    }
}
