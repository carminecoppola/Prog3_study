public class PurseTest {
    public static void main(String[] args){

        Purse borsellino = new Purse();

        borsellino.addQuarter(10);
        borsellino.addNickels(90);
        borsellino.addDimes(40);

        System.out.println("Il totale è: "+ borsellino.getTotal());

    }
}
