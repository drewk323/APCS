package ElevensGame.Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck one = new Deck(ranks, suits, pointValues);

        System.out.println(one.toString());
		System.out.println(one.deal());
		System.out.println(one.isEmpty());
		System.out.println(one.size() + 1);
    }
}
