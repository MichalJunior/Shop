public class User {
    String login;
    String password;
    Role role;

    public User(String login, String password,Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
    enum Role{
        isAdmin,
        isUser;
    }



}
