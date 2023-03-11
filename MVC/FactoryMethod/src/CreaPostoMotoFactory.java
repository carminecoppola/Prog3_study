public class CreaPostoMotoFactory implements CreaPostoFactory{
    public Posto creaPosto(){
        return new PostoMoto();
    }
}
