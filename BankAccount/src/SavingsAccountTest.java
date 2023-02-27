public class SavingsAccountTest {
    public static void main(String[] args) {

        SavingsAccount banca = new SavingsAccount();

        banca.deposit(100);

        System.out.println("Il saldo iniziale è: " + banca.getBalance());
        banca.addInterest();
        System.out.println("Il saldo dopo essere stato tassato è: " + banca.getBalance());
    }
}
