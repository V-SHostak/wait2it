package Generics.Bank;

public class BankMain {

    public static void main(String[] args) {

        User userFirst = new User("Ivan", 25);
        DebitAccount debitAccount = new DebitAccount("01", 1500);
        CreditAccount creditAccount = new CreditAccount(0101, 2500);
        userFirst.accountSetAdd(creditAccount);
        userFirst.accountSetAdd(debitAccount);

        User userSecond = new User("Andriy", 35);
        DebitAccount debitAccount2 = new DebitAccount("02", 1200);
        CreditAccount creditAccount2 = new CreditAccount(0202, 2200);
        userSecond.accountSetAdd(debitAccount2);
        userSecond.accountSetAdd(creditAccount2);

        User userThird = new User("Volodymyr", 40);
        DebitAccount debitAccount3 = new DebitAccount("03", 1800);
        CreditAccount creditAccount3 = new CreditAccount(0303, 2400);
        userThird.accountSetAdd(debitAccount3);
        userThird.accountSetAdd(creditAccount3);

        UserServiceImplement userService = new UserServiceImplement();
        userService.userSetAdd(userFirst);
        userService.userSetAdd(userSecond);
        userService.userSetAdd(userThird);

        System.out.println("Account list:");
        userService.printAllAccount();
        System.out.println();
        System.out.println("Users list:");
        userService.printAllUser();
        System.out.println();
        System.out.println("Taxes list:");
        userService.printTax();

    }

}
