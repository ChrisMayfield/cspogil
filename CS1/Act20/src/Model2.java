import java.time.LocalDate;

public class Model2 {

    public static void main(String[] args) {
        Person p1 = new Person("Helen", LocalDate.parse("2000-01-02"));
        Student s1 = new Student("John", LocalDate.parse("2000-03-04"));
        Person poly = new Student("Polly", LocalDate.parse("2000-05-06"));

        System.out.println(p1 instanceof Student);
        System.out.println(s1 instanceof Student);
        System.out.println(poly instanceof Student);
    }

}
