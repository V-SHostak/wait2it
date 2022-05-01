package Example;

import java.util.Scanner;

public class TestMetod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println((calc(a, b, n1)));
        System.out.println((calc(a, b, n2)));
        System.out.println((calc(a, b, n3)));

    }

    private static double calc(double a, double b, int op) {

        return switch (op) {
            case 1 -> a - b;
            case 2 -> a * b;
            case 3 -> a / b;
            default -> a + b;
        };
    }
}

