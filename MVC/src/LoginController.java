public class LoginController {
    private UtentiModel utentiModel;
    private LoginView loginView;

    public LoginController(UtentiModel utentiModel, LoginView loginView){
        super();
        this.utentiModel = utentiModel;
        this.loginView = loginView;
    }

    private User loginUser(){
        User currentUser = loginView.getUserCredentials();

        for (User user : this.utentiModel.getUtenti())
        {
            if (user.getUsername().equals(currentUser.getUsername()) &&
                    user.getPassword().equals(currentUser.getPassword())) {
                return user;
            }
        }
        return null;    //Non c'è nessun utente per quelle credenziali
    }

    public void doLogin() {
        User user = loginUser();
        if (user == null){
            loginView.printWrongCredentials();
        }
        else{
            loginView.printUserDetail(user);
        }
    }
}
