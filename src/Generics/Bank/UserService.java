package Generics.Bank;

public interface UserService <T extends Account, User> {

    void printAllAccount();

    void printAllUser();

    void printTax();
}
