package Integer;

import java.util.Scanner;

public class Integer26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day 1-365: ");
        int d = sc.nextInt();
        int day = (d + 2) % 7;
        System.out.println("Day of the week: " + day);
    }
}
