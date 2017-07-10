/**
 * Simulates a Die object.
 */
public class Die {
    
    private int face;
    
    /**
     * Constructs a new die with a random face value.
     */
    public Die() {
        this.face = 1;
    }
    
    /**
     * Gets the current face value of the die.
     *
     * @return current face value of the die
     */
    public int getFace() {
        return this.face;
    }
    
    /**
     * Simulates the roll of the die.
     *
     * @return new face value of the die
     */
    public int roll() {
        this.face = (int) (Math.random() * 6) + 1;
        return this.face;
    }
    
}
