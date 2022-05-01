package Case;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score 1-5");
        System.out.print("K = ");
        int k = sc.nextInt();

        switch (k) {
            case 1:
                System.out.println("bad");
                break;
            case 2:
                System.out.println("unsatisfactorily");
                break;
            case 3:
                System.out.println("satisfactorily");
                break;
            case 4:
                System.out.println("good");
                break;
            case 5:
                System.out.println("very good");
                break;
            default:
                System.out.println("Error, the number K must be between 1 and 5");

        }

    }
}
