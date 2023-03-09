import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private List<Character> permessi;

    public User(){}
    public User(String username,String nome,String cognome,String email, String password){
        super();
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.permessi = new ArrayList<Character>();
        this.permessi.add('r');
    }

    public void setPermessi(List<Character> permessi) {this.permessi = permessi;
    }
    public List<Character> getPermessi(){return permessi;}

    //Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "Utente di tipo User: \n Username:" + this.getUsername() + "\n Nome:" + this.getNome() + "\n Cognome:" + this.getCognome()
                + "\n Email:" + this.getEmail() + "\n Password: " + this.getPassword() ;
    }
}
