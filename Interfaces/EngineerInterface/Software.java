package EngineerInterface;

public class Software implements Engineer{
    public void useCad(boolean using){
        using = true;
        System.out.println("Using CAD: " + using);
    }
    public void designProduct(String product){
        System.out.println("Product: " + product);
    }
    public void payDues(int dues){
        System.out.println("Dues: " + dues);
    }
    public void getTitle(String title){
        System.out.println("Title: " + title);
    }
}
