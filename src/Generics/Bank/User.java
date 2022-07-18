package Generics.Bank;

import java.util.HashSet;
import java.util.Set;

public class User implements Comparable{

    private String name;
    private int age;
    Set<Account> accountSet = new HashSet<>();

    public void accountSetAdd(Account account) {
        accountSet.add(account);
    }

    public void getAllAccount() {
        for (Account a : accountSet) {
            System.out.println("account id = " + a.getId() + ", sum = " + a.getSum());
        }
    }

    public double getSum() {
        double temp = 0;
        for (Account a : accountSet) {
            temp = temp + a.getSum();
        }
        return temp;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age + "\n";
    }

    @Override
    public int compareTo(Object o1) {
        User user = (User) o1;
        if (this.name.compareTo(user.name) > 0) {
            return 1;
        } else if (this.name.compareTo(user.name) < 0) {
            return -1;
        } else {
            return this.name.compareTo(user.name);
        }
    }

}
