public class BankAccount {
    public BankAccount(double initBalance){
        this.balance = initBalance;
        lastAssignedNumber++;
        numConto = lastAssignedNumber;
    }

    public int getNumConto(){return  numConto;}
    public void deposit(double value){
        balance = balance + value;
    }

    public void withdraw(double value){
        balance = balance - value;
    }

    public double getBalance(){
        return balance;
    }

    private double balance;
    private int numConto;
    private static int lastAssignedNumber = 0;
}
