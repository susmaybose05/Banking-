import java.time.LocalDateTime;

public class Transaction {
    private String transactionType;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(String transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public void displayTransaction() {
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: " + amount);
        System.out.println("Date and Time: " + dateTime);
    }
}
