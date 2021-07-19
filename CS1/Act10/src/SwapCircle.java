public class SwapCircle {

    private static int circleCount = 0;

    private double radius;

    public SwapCircle(double radius) {
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

    public static void swapCircles(SwapCircle c1, SwapCircle c2) {
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

}
