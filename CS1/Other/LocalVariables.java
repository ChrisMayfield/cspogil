public class LocalVariables {

    public static void printResult(int qty, double amt) {
        System.out.printf("%d for $%.2f\n", qty, amt);
    }

    public static void main(String[] args) {
        int count = 3;
        double price = 9.99;
        char grade = 'A';
        boolean okay = true;
        printResult(count, price);
        count++;
        price *= 2;
        okay = !okay;
        printResult(count, price);
    }

}
