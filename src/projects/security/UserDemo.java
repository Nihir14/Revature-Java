package projects.security;

public class UserDemo {
    public static void main(String[] args) {

        UserAccount user = new UserAccount("nihir", "java1234");

        System.out.println(user.login("java1234"));
        System.out.println(user.login("wrongpass"));
    }
}
