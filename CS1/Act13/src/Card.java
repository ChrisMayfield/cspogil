public class Card {

    private int rank;  // 1=Ace, ..., 11=Jack, 12=Queen, 13=King
    private int suit;  // 0=Clubs, 1=Diamonds, 2=Hearts, 3=Spades

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static void main(String[] args) {
        Card card = new Card(8, 1);
    }

}
