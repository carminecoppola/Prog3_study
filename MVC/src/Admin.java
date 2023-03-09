public class Admin extends Editor{
    public Admin(){
        super();
        this.getPermessi().add('c');    //Create
    }

    public Admin(String username,String nome,String cognome,String email, String password){
        super(username, nome, cognome, email, password);
        this.getPermessi().add('c');
    }

    @Override
    public String toString(){
        return "Admin \nUsername:" + this.getUsername() + "\n Nome:" + this.getNome() + "\n Cognome:" + this.getCognome()
                + "\n Email:" + this.getEmail() + "\n Password: " + this.getPassword() ;
    }
}
