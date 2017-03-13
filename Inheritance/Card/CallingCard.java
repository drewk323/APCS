package Card;

public class CallingCard extends Card {
    private static int CARD_NUMBER = 0;
    private static int CARD_PIN = 0;

    public CallingCard(String n, int cardNum, int cardPin){
        super(n);
        CARD_NUMBER = cardNum;
        CARD_PIN = cardPin;
    }
}
