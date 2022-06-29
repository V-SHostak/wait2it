package ComparableUser;

public class User implements Comparable<User> {

    String userName;
    Integer userAge;
    String emailAddress;

    public User(String userName, Integer userAge, String emailAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.emailAddress = emailAddress;
    }

    @Override
    public int compareTo(User user) {
        int result = this.userName.compareTo(user.userName);
        if (result == 0){
            result = this.userAge.compareTo(user.userAge);
        } else if (result == 0) {
            result = this.emailAddress.compareTo(user.emailAddress);
        }
        return result;
    }
}
