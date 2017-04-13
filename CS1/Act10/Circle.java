/**
 * Geometric shape defined by a radius value.
 * 
 * @author Chris Mayfield
 * @version 11/14/2016
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
        return radius;
    }
    
    /**
     * Sets the radius value (mutator method).
     * 
     * @param radius new radius value
     */
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
        else {
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
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Circle small;
        Circle big;
        
        small = new Circle(1);
        System.out.println("small area = " + small.area());
        System.out.println("small circ = " + small.circumference());
        
        big = new Circle(2);
        System.out.println("big area = " + big.area());
        System.out.println("big circ = " + big.circumference());
    }
    
}
