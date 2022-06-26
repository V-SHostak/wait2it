package MyException;

public class MainClass {
    public static void main(String[] args) throws IllegalAccessException {

        Methods methods = new Methods();

        try {
            System.out.println(methods.addition(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (MyException e) {
            System.out.println(e);
        }


        try {
            System.out.println(methods.multiplication(0, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (MyException e) {
            System.out.println(e);
        }

        try {
            System.out.println(methods.division(-3, -2));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (MyException e) {
            System.out.println(e);
        }

        try {
            System.out.println(methods.subtraction(3, 9));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (MyException e) {
            System.out.println(e);
        }

    }
}