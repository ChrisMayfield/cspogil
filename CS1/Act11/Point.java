/**
 * A two-dimensional point on the Cartesian plane.
 */
public class Point {

    private int x;
    private int y;

    /**
     * Constructs a point at the origin.
     */
    public Point() {
        // attributes are automatically initialized to zero
    }

    /**
     * Constructs a point at the given coordinates.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a point at the same location.
     */
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    /**
     * Determines whether two points are equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }

    /**
     * Gets the x value.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets the y value.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Sets the x value.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y value.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns a string representation of this point.
     */
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    /**
     * Example use of Point objects.
     */
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(0, 0);
        Point p3 = new Point(3, 3);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println();

        System.out.println(p1.toString());
        System.out.println(p3.equals("(0, 0)"));
        System.out.println();

        System.out.println(p3.toString());
        System.out.println(p3.equals("(3, 3)"));
        System.out.println();
    }

}
