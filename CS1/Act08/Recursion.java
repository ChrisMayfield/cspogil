public class Recursion {
    
    public static int factorial(int n) {
        System.out.println("n is " + n);
        if (n == 0) {
            return 1;  // base case
        } else {
            System.out.printf("need factorial of %d\n", n - 1);
            int answer = factorial(n - 1);
            System.out.printf("factorial of %d is %d\n", n - 1, answer);
            return n * answer;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    
}
