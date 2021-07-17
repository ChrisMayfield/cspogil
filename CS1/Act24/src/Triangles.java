import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;

/**
 * Recursive triangles, based on Sierpinski and DrawingPanel from
 * https://courses.cs.washington.edu/courses/cse143/20wi/lectures/.
 * 
 * @author Chris Mayfield
 * @version 04/13/2021
 */
public class Triangles extends Drawing {

    public static final int LEVELS = 0;

    /**
     * Constructs and displays the Triangles.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // calls the Drawing() constructor
        new Triangles();
    }

    /**
     * Called by paint() to draw the Triangles.
     */
    @Override
    public void draw() {
        // get coordinates from canvas size
        int height = (int) Math.round(0.9 * getHeight());
        int length = (int) Math.round(height * 2.0 / Math.sqrt(3.0));
        int ymargin = (getHeight() - height) / 2;
        int xmargin = (getWidth() - length) / 2;

        // start with the outermost triangle
        Point p1 = new Point(xmargin + 0, ymargin + height);
        Point p2 = new Point(xmargin + length / 2, ymargin + 0);
        Point p3 = new Point(xmargin + length, ymargin + height);
        tri(0, p1, p2, p3);
    }

    /**
     * Draws recursive triangles to the given level inside the triangle whose
     * vertices are (p1, p2, p3).
     * 
     * @param level recursive count
     * @param p1 bottom left
     * @param p2 top middle
     * @param p3 bottom right
     */
    public void tri(int level, Point p1, Point p2, Point p3) {
        trace(level, "Starting tri (%d, %d), (%d, %d), (%d, %d)", p1.x, p1.y,
                p2.x, p2.y, p3.x, p3.y);

        // draw an outline of this triangular area
        Polygon p = new Polygon();
        p.addPoint(p1.x, p1.y);
        p.addPoint(p2.x, p2.y);
        p.addPoint(p3.x, p3.y);
        g2.setColor(Color.BLUE);
        g2.drawPolygon(p);

        if (level == LEVELS) {
            // base case: filled triangle
            g2.setColor(Color.GRAY);
            g2.fillPolygon(p);
        } else {
            // recursive case, split into 3 triangles
            Point p4 = midpoint(p1, p2);
            Point p5 = midpoint(p2, p3);
            Point p6 = midpoint(p1, p3);

            // recurse on each of the triangular areas
            tri(level + 1, p1, p4, p6);
            tri(level + 1, p4, p2, p5);
            tri(level + 1, p6, p5, p3);
        }

        // clear the outline of this triangular area
        g2.setColor(Color.WHITE);
        g2.drawPolygon(p);

        trace(level, "Finished tri (%d, %d), (%d, %d), (%d, %d)", p1.x, p1.y,
                p2.x, p2.y, p3.x, p3.y);
    }

    /**
     * Computes the midpoint of a line segment.
     * 
     * @param p1 triangle vertex #1
     * @param p2 triangle vertex #2
     * @return midpoint of p1 and p2
     */
    public Point midpoint(Point p1, Point p2) {
        int midx = (p1.x + p2.x) / 2;
        int midy = (p1.y + p2.y) / 2;
        return new Point(midx, midy);
    }

}
