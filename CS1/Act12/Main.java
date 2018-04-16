public class Main {
    public static void main(String[] args) {
        
        // 1. Declare the array
        Card[] hand;
        
        // 2. Instantiate the array
        hand = new Card[2];
        
        // 3. Instantiate each object
        hand[0] = new Card(4, 2);
        hand[1] = new Card(3, 1);
        
        // Question #5
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                int suit = hand[i].getSuit();
                System.out.println("The suit of #" + i + " is " + Card.SUITS[suit]);
            }
        }
        
    }
}
