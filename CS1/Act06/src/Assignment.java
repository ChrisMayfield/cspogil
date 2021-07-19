public class Assignment {

    public static void programA() {
        int x, y;
        x = 1;
        y = 2;
        y = x;
        x = y;

        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }

    public static void programB() {
        int x, y, z;
        x = 1;
        y = 2;
        z = y;
        y = x;
        x = z;

        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }

    public static void programC() {
//        int z, y;
//        z = 2;
//        z = z + 1;
//        z = z + 1;
//        y = y + 1;
//
//        System.out.println("Value of z: " + z);
//        System.out.println("Value of y: " + y);
    }

    public static void main(String[] args) {
        System.out.println("==== Program A ====");
        programA();
        System.out.println();

        System.out.println("==== Program B ====");
        programB();
        System.out.println();

        System.out.println("==== Program C ====");
        programC();
        System.out.println();
    }

}
