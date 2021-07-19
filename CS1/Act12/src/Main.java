import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1. Declare the array
        Card[] hand;

        // 2. Instantiate the array
        hand = new Card[5];

        // 3. Instantiate each object
        hand[0] = new Card(4, 2);
        hand[1] = new Card(3, 1);

        // Question #5
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                int suit = hand[i].getSuit();
                System.out.println(
                        "The suit of #" + i + " is " + Card.SUITS[suit]);
            }
        }

        // Question #6
        System.out.println();
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : days) {
            System.out.println(day + " is a great day!");
        }

        // Question #12
        Card[] deck = new Card[52];
        int index = 0;
        int[] suits = {0, 3, 2, 1};
        for (int suit : suits) {
            for (int rank = 1; rank <= 13; rank++) {
                deck[index] = new Card(rank, suit);
                index++;
            }
        }

        // Question #14
        System.out.println("\nBefore:");
        System.out.println(Arrays.toString(deck));
        deck = sort(deck);
        System.out.println("\nAfter:");
        System.out.println(Arrays.toString(deck));
    }

    public static Card[] sort(Card[] deck) {
        if (deck == null) {
            System.err.println("Missing deck!");
            return null;
        }
        Card[] sorted = new Card[deck.length];
        for (Card card : deck) {
            int index = card.position();  // returns suit * 13 + rank - 1
            sorted[index] = card;
        }
        return sorted;
    }

}
