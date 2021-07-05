/**
 * Geometric shape defined by a radius value.
 */
public class Circle {

    /** The radius of the circle. */
    private double radius;

    /**
     * Constructs a circle with the given radius.
     * 
     * @param radius initial radius value
     */
    public Circle(double radius) {
        setRadius(radius);
    }

    /**
     * Gets the radius value (accessor method).
     * 
     * @return current radius value
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Sets the radius value (mutator method).
     * 
     * @param radius new radius value
     */
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    /**
     * Calculates the area.
     * 
     * @return area of the circle
     */
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Calculates the circumference.
     * 
     * @return circumference of the circle
     */
    public double circumference() {
        return 2.0 * Math.PI * this.radius;
    }

    /**
     * Example application that declares, instantiates, and prints circles.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Circle one = new Circle(1);
        System.out.println("one area = " + one.area());
        System.out.println("one circ = " + one.circumference());

        Circle two = new Circle(2);
        System.out.println("two area = " + two.area());
        System.out.println("two circ = " + two.circumference());
    }

}
