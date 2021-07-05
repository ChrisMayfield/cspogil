public class SwapDriver {

    public static void main(String[] args) {

        // first try swapping integers
        int a = 7, b = 4;
        System.out.println("BEFORE swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        SwapCircle.swapInts(a, b);
        System.out.println("AFTER swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        // next try swapping SwapCircle radii
        SwapCircle first, second;
        first = new SwapCircle(7);
        second = new SwapCircle(4);
        System.out.println("BEFORE swap:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        SwapCircle.swapCircles(first, second);
        System.out.println("AFTER swap:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println();

        System.out.printf("This program created %d circles",
                SwapCircle.getCircleCount());
        System.out.println();
    }

}
