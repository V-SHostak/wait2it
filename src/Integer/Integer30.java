package Integer;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        int century = year/100 + 1;
        System.out.println("Century: " + century);

    }
}
