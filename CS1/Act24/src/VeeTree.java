import java.awt.Color;

/**
 * Recursive tree of left and right branches.
 * 
 * @author Chris Mayfield
 * @version 04/13/2021
 */
public class VeeTree extends Drawing {

    public static final int VEE_WIDTH = 150;

    public static final int VEE_HEIGHT = 75;

    /**
     * Constructs and displays the VeeTree.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // calls the Drawing() constructor
        new VeeTree();
    }

    /**
     * Called by paint() to draw the VeeTree.
     */
    @Override
    public void draw() {
        // start drawing from the bottom
        vee(0, 400, 350);
    }

    /**
     * Draws a nifty pattern inspired by the letter V.
     * 
     * @param level recursive count
     * @param x bottom x location
     * @param y bottom y location
     */
    public void vee(int level, int x, int y) {
        trace(level, "Starting vee(%d, %d)", x, y);

        // show current location
        g2.setColor(Color.BLACK);
        String loc = "(" + x + ", " + y + ")";
        g2.drawString(loc, x, y);

        // calculate coordinates
        int left = x - VEE_WIDTH / (level + 1);
        int right = x + VEE_WIDTH / (level + 1);
        int top = y - VEE_HEIGHT;

        // draw left branch
        g2.setColor(Color.MAGENTA);
        g2.drawLine(x, y, left, top);
        diamond(left, top);
        trace(level, "diamond(%d, %d)", left, top);

        // draw right branch
        g2.setColor(Color.BLUE);
        g2.drawLine(x, y, right, top);
        triangle(right, top);
        trace(level, "triangle(%d, %d)", right, top);

        trace(level, "Finished vee(%d, %d)", x, y);
    }

}
