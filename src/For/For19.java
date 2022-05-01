package For;

import java.util.Scanner;

public class For19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N>0: ");
        int n = sc.nextInt();
        double mult = 1;

        for (int i = 1; i <= n; i++) {
            mult *= i;
        }
        System.out.println("!" + n + " = " + mult);
    }
}

