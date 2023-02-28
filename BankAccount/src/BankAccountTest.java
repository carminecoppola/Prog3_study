public class BankAccountTest {
    public static void main(String[] args){
   /*
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
    */
    //2
        Bank fineco = new Bank();

        fineco.getContoCorrente(0).deposit(7000);
        fineco.getContoCorrente(0).withdraw(300);
        fineco.getContoCorrente(0).printConto();
        System.out.println("Il bilancio del primo conto è: " + fineco.getContoCorrente(0).getBalance());

        fineco.getContoCorrente(1).deposit(4000);
        fineco.getContoCorrente(1).withdraw(50);
        fineco.getContoCorrente(1).printConto();
        System.out.println("Il bilancio del secondo conto è: " + fineco.getContoCorrente(1).getBalance());

        fineco.taxConto();
        System.out.println("\nIl bilancio del primo conto dopo tassamento è: " + fineco.getContoCorrente(0).getBalance());
        System.out.println("Il bilancio del secondo conto dopo tassamento è: " + fineco.getContoCorrente(1).getBalance());

        System.out.println("\nIl bilancio del " + fineco.getContoCorrente(0).printConto() + " conto dopo conversione è: " + fineco.getContoCorrente(0).covert());
        System.out.println("Il bilancio del " + fineco.getContoCorrente(1).printConto() + " conto dopo conversione è: " + fineco.getContoCorrente(1).covert());

    }
}
