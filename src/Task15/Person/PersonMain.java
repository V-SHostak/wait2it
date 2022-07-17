package Task15.Person;

public class PersonMain {

    public static void main(String[] args) {

        Person person1 = new Person("Ivan");
        Account accountPerson11 = new Account(10);
        Account accountPerson12 = new Account(20);
        Account accountPerson13 = new Account(30);

        Person person2 = new Person("Stepan");
        Account accountPerson21 = new Account(100);
        Account accountPerson22 = new Account(200);
        Account accountPerson23 = new Account(300);

        Person person3 = new Person("Fedir");
        Account accountPerson31 = new Account(1000);
        Account accountPerson32 = new Account(2000);
        Account accountPerson33 = new Account(3000);

        AccountList accountList = new AccountList();

        System.out.println("Add person");
        accountList.addPerson(person1);
        accountList.addPerson(person2);
        accountList.addPerson(person3);
        accountList.printPerson();

        System.out.println("-----------------------------------------------------");

        System.out.println("Add accounts to persons");

        accountList.addAccount("Ivan", accountPerson11);
        accountList.addAccount("Ivan", accountPerson12);
        accountList.addAccount("Ivan", accountPerson13);
        accountList.addAccount("Stepan", accountPerson21);
        accountList.addAccount("Stepan", accountPerson22);
        accountList.addAccount("Stepan", accountPerson23);
        accountList.addAccount("Fedir", accountPerson31);
        accountList.addAccount("Fedir", accountPerson32);
        accountList.addAccount("Fedir", accountPerson33);
        accountList.printPerson();

        System.out.println("------------------------------------------------------");

        System.out.println("Remove account for person Stepan");
        accountList.removeAccount("Stepan", accountPerson22);
        accountList.printPerson();

        System.out.println("-------------------------------------------------------");

        System.out.println("Remove Stepan");
        accountList.removePerson("Stepan");
        accountList.printPerson();

    }

}
