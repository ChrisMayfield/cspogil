public enum Month {

    JAN("January", 31),
    FEB("February", 28),
    MAR("March", 31),
    APR("April", 30),
    MAY("May", 31),
    JUN("June", 30),
    JUL("July", 31),
    AUG("August", 31),
    SEP("September", 30),
    OCT("October", 31),
    NOV("November", 30),
    DEC("December", 31);

    private final String name;
    private final int days;

    private Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public int length() {
        return days;
    }

    public int number() {
        return ordinal() + 1;
    }

    public static Month parseMonth(String name) {
        String abbr = name.substring(0, 3);
        return valueOf(abbr.toUpperCase());
    }

    public String toString() {
        return name;
    }

    /**
     * Examples that use Month constants.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Month m1 = AUG;
        System.out.println(m1);
        System.out.println(m1.number());
        System.out.println(m1.length());

        Month m2 = parseMonth("Sept.");
        System.out.println(m2);
        System.out.println(m2.number());
        System.out.println(m2.length());
    }

}
