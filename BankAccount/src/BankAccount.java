public class BankAccount {

    public BankAccount(double initBalance){
        this.balance = initBalance;
        lastAssignedNumber++;
        numConto = lastAssignedNumber;  //Incremento per il successivo oggetto il numero di conto
    }

//Metodo di get che ritorna il numero di conto di ogni account
    public int getNumConto(){return  numConto;}

//Metodo che implementa il deposito di una quantità dal saldo
    public void deposit(double value){
        balance = balance + value;
    }

//Metodo che implementa il prelievo di una quantità dal saldo
    public void withdraw(double value){
        balance = balance - value;
    }

//Metodo di get che ritorna il saldo di ogni account
    public double getBalance(){
        return balance;
    }

//Variabili
    private double balance;
    private int numConto;
    private static int lastAssignedNumber = 0;
}
