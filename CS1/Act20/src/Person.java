import java.time.LocalDate;

public class Person {

    protected String name;
    protected LocalDate birth;

    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person that = (Person) obj;
            return this.name.equals(that.name) && this.birth.equals(that.birth);
        }
        return false;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%s (%s)", this.name, this.birth);
    }

}
