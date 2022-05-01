package Integer;

import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds from the beginning of the day: ");
        int s = sc.nextInt();
        int min = s / 60;
        System.out.println("Minutes: " + min);
    }
}
