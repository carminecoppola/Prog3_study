public class CreaPostoFurgoneFactory implements CreaPostoFactory{

    public Posto creaPosto(){
        return new PostoFurgone();
    }
}
