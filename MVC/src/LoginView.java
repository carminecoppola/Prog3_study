import java.util.Scanner;

public class LoginView {
    public void printUserDetail(User user){
        System.out.println(user.toString());
        printPermessi(user);
    }

    private void printPermessi(User user) {
        System.out.println("Permessi: ");
        for (char permesso: user.getPermessi()){
            System.out.println(permesso + " ");
        }
    }

    public void printWrongCredentials(){
        System.out.println("Credenziali errate/Utente NON trovato");
    }

    public User getUserCredentials(){
        User currentUser = new User(); //Instanziamo un oggetto currentUser
        //Instanziamo uno scanner per prendere in input da console
        Scanner scan = new Scanner(System.in);
        //Prendiamo username & password
        System.out.println("Inserisci Username:");
        currentUser.setUsername(scan.nextLine());   //NextLine prende la riga successiva dallo scanner
        System.out.println("Inserisci Password:");
        currentUser.setPassword(scan.nextLine());

        scan.close();
        return currentUser;

    }
}
