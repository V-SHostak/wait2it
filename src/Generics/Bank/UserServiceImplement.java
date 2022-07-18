package Generics.Bank;

import java.util.TreeSet;

public class UserServiceImplement<T> implements UserService<Account,User>{

    TreeSet<User> userSet = new TreeSet<>();

    public void userSetAdd(User user) {
        userSet.add(user);
    }

    @Override
    public void printAllAccount() {
        for (User userAccount : userSet) {
            System.out.println("Name = " + userAccount.getName());
            userAccount.getAllAccount();
        }
    }

    @Override
    public void printAllUser() {
        System.out.println(userSet);

    }

    @Override
    public void printTax() {
        for (User userAccount : userSet) {
            System.out.print("Name = " + userAccount.getName());
            System.out.println(" tax 5%: " + (int) (userAccount.getSum() * 0.05));
        }

    }
}
