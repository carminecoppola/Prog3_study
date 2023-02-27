public class SavingsAccount extends BankAccount{
    public SavingsAccount(){

    }

//Metodi
    public void addInterest(){
        this.deposit(getBalance() * interestRate/100);
    };

//Variabili
    private static double interest;
    private static double interestRate = 4;

}
