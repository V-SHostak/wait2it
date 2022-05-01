package Integer;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers number where A>B:");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        int amount = a % b;
        System.out.println("The length of the unoccupied segment \n" + amount);

    }
}
