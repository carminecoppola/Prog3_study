public class BankAccount {
    //extend Bank serve per l'esercizo di Bank
    public BankAccount(double initBalance){
        this.balance = initBalance;
        lastAssignedNumber++;
        numConto = lastAssignedNumber;  //Incremento per il successivo oggetto il numero di conto
    }

    //Overload
    public BankAccount(){
        this(0);
    }

//Metodo di get che ritorna il numero di conto di ogni account
    public int getNumConto(){return  numConto;}

//Metodo che implementa il deposito di una quantità dal saldo
    public void deposit(double value){
        balance = balance + value;
        totalDeposit++;
    }
//Metodo che implementa il prelievo di una quantità dal saldo
    public void withdraw(double value){
        balance = balance - value;
    }

//Metodo di get che ritorna il saldo di ogni account
    public double getBalance(){
        return balance;
    }

//Metodo che mi ritorna il numero totale di depositi che servirà per la classe Bank

    public int getTotDeposit(){return totalDeposit;}

//Variabili
    private double balance;
    private int numConto;
    private static int lastAssignedNumber = 0;
    private int totalDeposit = 0;
}
