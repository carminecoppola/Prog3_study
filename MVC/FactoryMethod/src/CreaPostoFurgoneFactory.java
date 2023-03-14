public class CreaPostoFurgoneFactory extends FactoryCreaPosto {

    public Posto creaPosto(){
        return new PostoFurgone();
    }
}
