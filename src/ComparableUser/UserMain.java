package ComparableUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UserMain {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Andriy", 33, "erteretff@gmail.com"));
        users.add(new User("Volodya", 23, "dsff@gmail.com"));
        users.add(new User("Yulya", 25, "resff@gmail.com"));
        users.add(new User("Ivan", 45, "yt3eff@gmail.com"));
        users.add(new User("Volodya", 23, "hsff@gmail.com"));
        users.add(new User("Andriy", 12, "drrrff@gmail.com"));

        Collections.sort(users);
        for (User us : users) {
            System.out.println(us.userName + ", " + us.userAge + ", " + us.emailAddress);
        }

    }
}
