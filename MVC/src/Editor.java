public class Editor extends User{
    public Editor(){
        super();
        this.getPermessi().add('w');    //Write
    }

    public Editor(String username,String nome,String cognome,String email, String password){
        super(username, nome, cognome, email, password);
        this.getPermessi().add('w');
    }

    @Override
    public String toString(){
        return "Editor \nUsername:" + this.getUsername() + "\n Nome:" + this.getNome() + "\n Cognome:" + this.getCognome()
                + "\n Email:" + this.getEmail() + "\n Password: " + this.getPassword() ;
    }
}
