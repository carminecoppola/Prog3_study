/*Calcolare:
*   Bilancio totale della banca;
*   Contare il numero di depositi totali della banca;
*   Stampare il numero di conto corrente usando sempre 10 cifre;
*   Tassare i conti corrente con più di 5000¢
*   Convertire la valura di un singolo conto corrente  */

public class Bank {
//Costruttore
    public Bank(BankAccount[] contoCorrente){
        this.contoCorrente = contoCorrente;
    }
//Calcola il bilancio totale della banca;
    public double getTotal(){
        double totale = 0;
        for (BankAccount i : contoCorrente)
        {
            totale += i.getBalance();
        }
        return  totale;
    }

//Calcola il numero totale di depositi
    public int getTotalDeposit(){
        int totalDeposit = 0;
        for (BankAccount i :contoCorrente)
        {
            totalDeposit += i.getTotDeposit();
        }
        return totalDeposit;
    }

//Stampare il numero di conto corrente usando sempre 10 cifre
    public void printConto() {
        for (BankAccount i:contoCorrente)
        {
            System.out.printf("%010d\n", i.getNumConto());
        }
    }

//Questo metodo va a tassare i conti corrente con più di 5000¢
    public void taxConto(){
        for (BankAccount i:contoCorrente)
        {
            if (i.getBalance() > 5000)
                i.withdraw(100);    //Sottraggo 100¢
        }
    }

//Questo metodo va a convertire la valuta

    public double currentConverter()
    {
        double saldo = 0;
        for (BankAccount i : contoCorrente)
            saldo = i.getBalance();
        return saldo = saldo * 0.7846;
    }

//Variabili
    private BankAccount[] contoCorrente;
}
