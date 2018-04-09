/**
 * This class represents a 24-bit color defined by three components: red, green,
 * and blue. Each RGB value ranges from 0 to 255 (darkest to lightest).
 */
public class Color {
    
    private int red;
    
    private int green;
    
    private int blue;
    
    /**
     * Creates a Color object with the specified RGB values.
     */
    public Color(int red, int green, int blue) {
        this.red = check(red);
        this.green = check(green);
        this.blue = check(blue);
    }
    
    /**
     * Creates a copy of the given color.
     * (Not that useful since Color objects are immutable.)
     */
    public Color(Color other) {
        this.red = other.red;
        this.green = other.green;
        this.blue = other.blue;
    }
    
    /**
     * Ensures the given value is in the range 0 to 255.
     */
    private static int check(int value) {
        if (value < 0) {
            value = 0;
        }
        if (value > 255) {
            value = 255;
        }
        return value;
    }
    
    /**
     * Adds the other color to this color, and returns that color.
     */
    public Color add(Color other) {
        int newRed = this.red + other.red;
        int newGreen = this.green + other.green;
        int newBlue = this.blue + other.blue;
        return new Color(newRed, newGreen, newBlue);
    }
    
    /**
     * Returns a darker version of this color (decreased by 32).
     */
    public Color darken() {
        int newRed = this.red - 32;
        int newGreen = this.green - 32;
        int newBlue = this.blue - 32;
        return new Color(newRed, newGreen, newBlue);
    }
    
    /**
     * Determines whether two colors are equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Color) {
            Color other = (Color) obj;
            return this.red == other.red
                && this.green == other.green
                && this.blue == other.blue;
        }
        return false;
    }
    
    /**
     * Returns a lighter version of this color (increased by 32).
     */
    public Color lighten() {
        int newRed = this.red + 32;
        int newGreen = this.green + 32;
        int newBlue = this.blue + 32;
        return new Color(newRed, newGreen, newBlue);
    }
    
    
    /**
     * Subtracts the other color from this color, and returns that color.
     */
    public Color sub(Color other) {
        int newRed = this.red - other.red;
        int newGreen = this.green - other.green;
        int newBlue = this.blue - other.blue;
        return new Color(newRed, newGreen, newBlue);
    }
    
    /**
     * Returns the color in HTML format (RGB in hexidecimal).
     */
    public String toString() {
        String redStr = Integer.toHexString(this.red);
        if (redStr.length() == 1) {
            redStr = "0" + redStr;
        }
        String greenStr = Integer.toHexString(this.green);
        if (greenStr.length() == 1) {
            greenStr = "0" + greenStr;
        }
        String blueStr = Integer.toHexString(this.blue);
        if (blueStr.length() == 1) {
            blueStr = "0" + blueStr;
        }
        return "#" + redStr + greenStr + blueStr;
    }
    
}
