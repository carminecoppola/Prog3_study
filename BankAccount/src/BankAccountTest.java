public class BankAccountTest {
    public static void main(String[] args){
    //Istanzio due oggetti banca
        BankAccount banca = new BankAccount(500);
        BankAccount banca2 = new BankAccount(200);
    //Stampo il saldo iniziale di entrambi
        System.out.println("Il saldo iniziale è: " + banca.getBalance() + " con Numero Conto = " + banca.getNumConto());
        System.out.println("Il saldo iniziale è: " + banca2.getBalance() + " con Numero Conto = " + banca2.getNumConto());
    //Operazioni di deposito e prelievo
        banca.deposit(100);
        banca2.deposit(400);
        banca.withdraw(300);
        banca2.withdraw(50);
    //Stampo il saldo finale di entrambi
        System.out.println("Il saldo finale è: " + banca.getBalance() + " con Numero Conto = " + banca.getNumConto());
        System.out.println("Il saldo finale è: " + banca2.getBalance() + " con Numero Conto = " + banca2.getNumConto());


    }
}
