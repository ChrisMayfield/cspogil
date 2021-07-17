public class Arrays {

    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] nums = {159, 227};
        printArray(nums);

        int[] data = null;
        int[] counts = {10, 3, 7, -5};
        double[] scores = new double[3];
    }

}
