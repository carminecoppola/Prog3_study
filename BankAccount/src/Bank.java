/*Calcolare:
*   Bilancio totale della banca;
*   Contare il numero di depositi totali della banca;
*   Stampare il numero di conto corrente usando sempre 10 cifre;
*   Tassare i conti corrente con più di 5000¢
*   Convertire la valura di un singolo conto corrente  */

public class Bank {
//Costruttore
    public Bank(){
        contoCorrente = new BankAccount[5];
        buildArray();
    }

//Costruzione array
    private void buildArray()
    {
        for (int i = 0; i < contoCorrente.length ; i++)
        {
            contoCorrente[i] = new BankAccount(0);  //Ogni saldo iniziale è 0
        }
    }

//Ritorna l'iesimo conto corrente
    public BankAccount getContoCorrente(int i){return contoCorrente[i];}

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

//Questo metodo va a tassare i conti corrente con più di 5000¢
    public void taxConto(){
        for (BankAccount i:contoCorrente)
        {
            if (i.getBalance() >= 5000)
                i.withdraw(100);    //Sottraggo 100¢
        }
    }

//Variabili
    private BankAccount[] contoCorrente;
}
