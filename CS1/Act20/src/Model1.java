import java.time.LocalDate;

public class Model1 {

    public static void main(String[] args) {
        LocalDate d = LocalDate.parse("1949-01-17");
        Teacher t1 = new Teacher("Anita Borg", d, 123456);
        Teacher t2 = new Teacher("Anita Borg", d, 123456);
        System.out.println(t1.equals(t2));
    }

}
