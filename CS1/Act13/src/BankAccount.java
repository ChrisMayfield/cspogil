public class BankAccount {
    private static final String PREFIX = "1234";
    private static int nextNumber = 1;

    private String number;
    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.number = PREFIX + String.format("%04d", nextNumber);
        this.owner = owner;
        nextNumber++;
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Stacie");
        BankAccount ba2 = new BankAccount("Trevor");
    }
}
