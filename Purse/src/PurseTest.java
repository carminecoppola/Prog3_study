import javax.swing.JOptionPane; //Pacchetto pannelli
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PurseTest {
    public static void main(String[] args) throws IOException {

        //throws IOException --> serve a lanciare l'eccezzione qualora il buffer è pieno

        Purse borsellino = new Purse();

        //Input tramite finestra di dilaogo
        String prova = JOptionPane.showInputDialog("Inserisci dimes:");
        int contatore = Integer.parseInt(prova);
        borsellino.addDimes(contatore);

        //Input da Terminale
        System.out.println("Inserisci nickels:");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String prova2 = buffer.readLine();
        int contatore2 = Integer.parseInt(prova2);
        borsellino.addNickels(contatore2);

        borsellino.addQuarter(10);
        //borsellino.addNickels(90);
        //borsellino.addDimes(40);

        System.out.println("Il totale è: "+ borsellino.getTotal());

    }
}
