package ma.bouargalne;


public class Transaction {
    private final String type;
    private final int amount;
    private final int balance;
    private final String date;

    public Transaction(String type, int amount, int balance) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.date = java.time.LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return date + " | " + type + " | " + amount + " | " + balance;
    }
}
