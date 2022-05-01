package String;

public class String23 {
    public static void main(String[] args) {
        String expression = "3+5-6+4";

        int result = expression.charAt(0) - 48;

        for (int i = 1; i < expression.length(); i += 2) {
            int digit = expression.charAt(i + 1) - 48;
            if (expression.charAt(i) == '+') {
                result = result + digit;

            } else {
                result = result - digit;
            }
        }
        System.out.println(result);
    }
}
