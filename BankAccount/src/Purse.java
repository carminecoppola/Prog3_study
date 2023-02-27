public class Purse {

//Il Costruttore è implicito

//Metodi
    public void addNickels(double nickels){numNickels += nickels;}
    public void addDimes(double dimes){numDimes += dimes;}
    public void addQuarter(double quarters){numQuarters += quarters;}

    public double getTotal(){
        return (numNickels * 0.05) + (numDimes * 0.1) + (numQuarters * 0.25);
    }

//Variabili

    private static double numNickels;
    private static double numDimes;
    private static double numQuarters;
}
