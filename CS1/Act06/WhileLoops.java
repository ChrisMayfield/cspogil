public class WhileLoops {

    public static void main(String[] args) {
        int number;

        // pre-test loop
        number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }

        System.out.println();

        // post-test loop
        number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 10);

        System.out.println("\n==== Question 16 ====");

//        number = 99;
//        do {
//            System.out.println(number);
//            number++;
//        } while (number <= 10);
//        System.out.println(number);

        System.out.println("\n==== Question 17 ====");

//        int i = 0;
//        while (i < 3)
//            System.out.println("i = " + i);
//            i = i + 1;
    }

}
