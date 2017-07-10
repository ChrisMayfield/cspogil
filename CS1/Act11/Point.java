/**
 * A two-dimensional point.
 */
public class Point {
    
    private int x;
    
    private int y;
    
    /**
     * Constructs a point a the origin.
     */
    public Point() {
        this.x = 0;
        this.y = 0;
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
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    /**
     * Determines whether two points are equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return this.x == p.x && this.y == p.y;
        }
        return false;
    }
    
    /**
     * Gets the x value.
     */
    public double getX() {
        return x;
    }
    
    /**
     * Gets the y value.
     */
    public double getY() {
        return y;
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
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 2);
        System.out.println("p1 is at " + p1);
        System.out.println("p2 is at " + p2);
    }
    
}
