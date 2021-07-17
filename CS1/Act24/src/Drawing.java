import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * Base class for tracing 2D graphics.
 * 
 * @author Chris Mayfield
 * @version 04/13/2021
 */
public class Drawing extends Canvas {

    /** Milliseconds after each trace. */
    public static final int DELAY = 500;

    /** The canvas's graphics context. */
    protected Graphics2D g2;

    /**
     * Sets up the canvas and window frame.
     */
    public Drawing() {
        this.setSize(800, 600);
        this.setBackground(Color.WHITE);
        String title = getClass().getName();
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    /**
     * Constructs and displays the Drawing.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        new Drawing();
    }

    /**
     * Called by the window toolkit to paint this Canvas. Initializes this.g2
     * and calls the draw() method.
     * 
     * @param g graphics context
     */
    @Override
    public void paint(Graphics g) {
        // store a reference to the 2D graphics context; this if-statement
        // also prevents the draw() method from being called multiple times
        if (this.g2 == null) {
            this.g2 = (Graphics2D) g;
            g2.setFont(new Font("Dialog", Font.BOLD, 11));
            g2.setStroke(new BasicStroke(2));
            draw();
        }
    }

    /**
     * Called by paint() to draw the Drawing.
     */
    public void draw() {
        diamond(300, 200);
        trace(0, "diamond(%d, %d)", 300, 200);

        triangle(400, 400);
        trace(1, "triangle(%d, %d)", 400, 400);

        diamond(500, 200);
        trace(0, "diamond(%d, %d)", 500, 200);
    }

    /**
     * Draws a small green diamond.
     * 
     * @param x bottom x location
     * @param y bottom y location
     */
    public void diamond(int x, int y) {
        int left = x - 5;
        int right = x + 5;
        int mid = y - 5;
        int top = y - 10;
        g2.setColor(Color.GREEN);
        g2.drawLine(x, y, left, mid);
        g2.drawLine(left, mid, x, top);
        g2.drawLine(x, top, right, mid);
        g2.drawLine(right, mid, x, y);
    }

    /**
     * Draws a small red triangle.
     * 
     * @param x bottom x location
     * @param y bottom y location
     */
    public void triangle(int x, int y) {
        int left = x - 5;
        int right = x + 5;
        int top = y - 10;
        g2.setColor(Color.RED);
        g2.drawLine(x, y, left, top);
        g2.drawLine(left, top, right, top);
        g2.drawLine(right, top, x, y);
    }

    /**
     * Prints debug info and slows down the drawing.
     * 
     * @param level amount to indent
     * @param format format string
     * @param args format arguments
     */
    public void trace(int level, String format, Object... args) {
        // indent and flush the output
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.printf(format, args);
        System.out.println();

        // sync and delay the drawing
        Toolkit.getDefaultToolkit().sync();
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            // ignore
        }
    }

}
