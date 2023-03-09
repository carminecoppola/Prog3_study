public class LoginClient {
    public static void main(String[] args) {
        //Pattern Design MVC
        UtentiModel utentiModel = new UtentiModel();    //MODEL
        LoginView loginView = new LoginView();         //VIEW
        LoginController loginController = new LoginController(utentiModel, loginView); //CONTROLLER

        loginController.doLogin();
    }
}
