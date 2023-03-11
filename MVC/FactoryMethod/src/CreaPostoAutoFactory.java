public class CreaPostoAutoFactory implements CreaPostoFactory{
    public Posto creaPosto(){
        return new PostoAuto();
    }
}
