package MyException;

public class MainClass {
    public static void main(String[] args) throws IllegalAccessException {

        Methods methods = new Methods();

        try {
            System.out.println(methods.addition(5, 0));
        } catch (IllegalArgumentException | IllegalAccessException | ArithmeticException | MyException e) {
            System.out.println(e);
        }


        try {
            System.out.println(methods.multiplication(0, 0));
        }  catch (IllegalArgumentException | IllegalAccessException | ArithmeticException | MyException e) {
            System.out.println(e);
        }

        try {
            System.out.println(methods.division(-3, -2));
        }  catch (IllegalArgumentException | IllegalAccessException | ArithmeticException | MyException e)  {
            System.out.println(e);
        }

        try {
            System.out.println(methods.subtraction(3, 9));
        }  catch (IllegalArgumentException | IllegalAccessException | ArithmeticException | MyException e)  {
            System.out.println(e);
        }

    }
}