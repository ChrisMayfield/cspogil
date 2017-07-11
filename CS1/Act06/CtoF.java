import java.util.Scanner;

public class CtoF {
    
    public static void show(double c) {
        double f;
        String str;
        f = c * 1.8 + 32;
        str = String.format("%.1f C = %.1f F\n", c, f);
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        double c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        c = in.nextDouble();
        show(c);
    }
    
}
