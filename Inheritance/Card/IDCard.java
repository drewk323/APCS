package Card;

public class IDCard extends Card{
    private static int ID_NUMBER = 0;

    public IDCard(String n, int id){
        super(n);
        ID_NUMBER = id;
    }
}
