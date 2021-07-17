import java.util.Arrays;  // for toString

public class Rectangular {
    public static void main(String[] args) {
        char[][] table = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'},
            {'J', 'K', 'L'},
        };
        System.out.println(table.length);
        System.out.println(table[0].length);
        System.out.println(table[1][2]);
        System.out.println(Arrays.toString(table));
    }
}
