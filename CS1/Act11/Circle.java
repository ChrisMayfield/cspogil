public class Circle {
    
    private static int circleCount = 0;
    
    private double radius;
    
    public Circle(double radius) {
        circleCount++;
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
    }
    
    public static int getCircleCount() {
        return circleCount;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public static void swapInts(int x, int y) {
        System.out.println("\tInside swapInts");
        System.out.println("\tswapping integers " + x + " and " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("\tfinished swapping " + x + " and " + y);
    }
    
    public static void swapCircles(Circle c1, Circle c2) {
        System.out.println("\tInside swapCircles");
        System.out.println("\tswapping circles " + c1 + " and " + c2);
        double r = c1.radius;
        c1.radius = c2.radius;
        c2.radius = r;
        System.out.println("\tfinished swapping " + c1 + " and " + c2);
    }
    
    public String toString() {
        return String.format("Circle(%.0f)", this.radius);
    }
    
    public static void main(String[] args) {
        
        // first try swapping integers
        int a = 7, b = 4;
        System.out.println("BEFORE swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        Circle.swapInts(a, b);
        System.out.println("AFTER swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        
        // next try swapping Circle radii
        Circle first, second;
        first = new Circle(7);
        second = new Circle(4);
        System.out.println("BEFORE swap:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        Circle.swapCircles(first, second);
        System.out.println("AFTER swap:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println();
        
        System.out.printf("This program created %d circles",
                          Circle.getCircleCount());
        System.out.println();
    }
}
