public class BankAccount {
    //extend Bank serve per l'esercizo di Bank
    public BankAccount(double initBalance){
        this.balance = initBalance;
        lastAssignedNumber++;
        numConto = lastAssignedNumber;  //Incremento per il successivo oggetto il numero di conto
        totalDeposit = 0;
    }

    //Overload
    public BankAccount(){
        this(0);
    }

//Metodo di get che ritorna il numero di conto di ogni account
    public int getNumConto(){return numConto;}

//Stampare il numero di conto corrente usando sempre 10 cifre
    public String printConto() {
        String formattNumber = String.format("%010d ", numConto);
        return formattNumber;
    }
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

//Metodo che converte la valuta di un saldo di un conto in dollari
    public double covert(){return (getBalance() * dollaro);}

//Metodo che mi ritorna il numero totale di depositi che servirà per la classe Bank
    public int getTotDeposit(){return totalDeposit;}

//Variabili
    private double balance;
    private int numConto;
    private static int lastAssignedNumber = 0;
    private int totalDeposit;
    private static double dollaro = 0.97;
}
