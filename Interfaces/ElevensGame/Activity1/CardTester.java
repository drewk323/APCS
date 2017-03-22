package ElevensGame.Activity1;

import ElevensGame.Activity1.Card;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card one = new Card("One", "Spades", 1);
        Card two = new Card("Four", "Spades", 4);
        Card three = new Card("Four", "Spades", 4);

        System.out.println(one.suit());
        System.out.println(one.rank());
        System.out.println(one.pointValue());
        System.out.println(one.matches(two));
        System.out.println(one.toString());

        System.out.println(two.suit());
        System.out.println(two.rank());
        System.out.println(two.pointValue());
        System.out.println(two.matches(three));

        System.out.println(three.suit());
        System.out.println(three.rank());
        System.out.println(three.pointValue());
        System.out.println(three.matches(two));
    }
}