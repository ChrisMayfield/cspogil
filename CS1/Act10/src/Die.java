/**
 * Simulates a die object.
 */
public class Die {

    private int face;

    /**
     * Constructs a die with face value 1.
     */
    public Die() {
        this.face = 1;
    }

    /**
     * @return current face value of the die
     */
    public int getFace() {
        return this.face;
    }

    /**
     * Simulates rolling the die.
     * 
     * @return new face value of the die
     */
    public int roll() {
        this.face = (int) (Math.random() * 6) + 1;
        return this.face;
    }

    /**
     * Example application that plays dice.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        System.out.println("Initial dice");
        System.out.println("d1 = " + d1.getFace() + ", d2 = " + d2.getFace());

        System.out.println();
        int sum = d1.roll() + d2.roll();
        System.out.println("You rolled " + sum);
        System.out.println("d1 = " + d1.getFace() + ", d2 = " + d2.getFace());
    }

}
