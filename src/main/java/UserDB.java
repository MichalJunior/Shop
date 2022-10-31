import java.util.ArrayList;
import java.util.List;

public class UserDB {
    public static List<User> users = new ArrayList<>();
     UserDB(){
         users.add(new User("admin","admin", User.Role.isAdmin));
         users.add(new User("user","user", User.Role.isUser));
     }


}
