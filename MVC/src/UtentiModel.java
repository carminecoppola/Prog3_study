import java.util.List;

public class UtentiModel {
    private List<User> utenti;

    public UtentiModel(){
        this.utenti = LoginDB.generateUserList();
    }

    public List<User> getUtenti(){
        return utenti;
    }

    public void setUtenti(List<User> utenti){
        this.utenti = utenti;
    }

}
