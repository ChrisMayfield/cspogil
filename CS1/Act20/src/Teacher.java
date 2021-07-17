import java.time.LocalDate;

public class Teacher extends Person {

    protected LocalDate hired;
    protected int salary;

    public Teacher(String name, LocalDate birth, int salary) {
        super(name, birth);
        this.hired = LocalDate.now();
        this.salary = salary;
    }

    public LocalDate getHired() {
        return hired;
    }

    public int getSalary() {
        return salary;
    }

    public void raise(double percent) {
        this.salary += Math.round(this.salary * percent);
    }

    public String toString() {
        return String.format("%s hired on %s making $%,d", super.toString(),
                this.hired, this.salary);
    }

}
