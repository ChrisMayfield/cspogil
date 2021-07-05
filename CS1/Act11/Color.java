/**
 * This class represents a 24-bit color defined by three components: red, green,
 * and blue. Each RGB value ranges from 0 to 255 (darkest to lightest).
 */
public class Color {

    private int red;
    private int green;
    private int blue;

    /**
     * Constructs the default Color of black.
     */
    public Color() {
        // attributes are automatically initialized to zero
    }

    /**
     * Constructs a Color object with the specified RGB values. Any values that
     * are less than zero are set to zero, and any values that are greater than
     * 255 are set to 255.
     */
    public Color(int red, int green, int blue) {
        this.red = clip(red);
        this.green = clip(green);
        this.blue = clip(blue);
    }

    /**
     * Ensures that the given value is in the range 0 to 255.
     */
    private static int clip(int value) {
        int result;
        if (value < 0) {
            result = 0;
        } else if (value > 255) {
            result = 255;
        } else {
            result = value;
        }
        return result;
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
            return this.red == other.red && this.green == other.green
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
    public Color subtract(Color other) {
        int newRed = this.red - other.red;
        int newGreen = this.green - other.green;
        int newBlue = this.blue - other.blue;
        return new Color(newRed, newGreen, newBlue);
    }

    /**
     * Returns the color in HTML format (RGB in hexadecimal).
     */
    public String toString() {
        return String.format("#%02x%02x%02x", this.red, this.green, this.blue);
    }

    /**
     * Example use of Color objects.
     */
    public static void main(String[] args) {
        Color black = new Color();
        Color other = new Color(0, 0, 0);
        Color gold = new Color(255, 215, 0);

        System.out.println(black == other);
        System.out.println(black.equals(other));
        System.out.println();

        System.out.println(black == gold);
        System.out.println(black.equals(gold));
        System.out.println();

        System.out.println(black.toString());
        System.out.println(gold.toString());
        System.out.println();
    }

}
