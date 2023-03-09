import java.util.ArrayList;
import java.util.List;

public class LoginDB {

    //Non usiamo un database come MongoDB ma popoliamo noi il nostro array di persone registrate
    public static List<User> generateUserList(){

        List<User> userList = new ArrayList<User>();

        User u1 = new User("p.rossi","Paolo","Rossi","p.rossi@gmail.com","paolopass");
        Editor u2 = new Editor("g.verdi","Giovanni","Verdi","g.verdi@gmail.com","gioverdi");
        Admin u3 = new Admin("e.moda","Vincenzo","Moda","e.mod@gmail.com","modaenz");

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);

        return userList;
    }
}
