public class Die {
    
    private int numOfSides;
    private int faceValue;
    
    public Die(int sides, int face) {
    }
    
    public String toString() {
        return String.format("sides = %d  face = %d",
                             this.numOfSides, this.faceValue);
    }
}
