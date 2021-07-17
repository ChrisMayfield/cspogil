import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        System.out.println("==== Example 1 ====");
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }

        System.out.println("==== Example 2 ====");
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input);
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.nextInt());
        System.out.println(s.next());

    }

}
