public class Main {
    public static void main(String[] args) {

     FactoryCreaPosto factory = new CreaPostoAutoFactory();
     Posto posto = factory.creaPosto();

     posto.parcheggia();    //L'auto si è parcheggiata

    factory = new CreaPostoMotoFactory();
    posto = factory.creaPosto();
    posto.parcheggia();    //La Moto si è parcheggiata

    factory = new CreaPostoFurgoneFactory();
    posto = factory.creaPosto();
    posto.parcheggia();   //Il furgone si è parcheggiato


    }
}