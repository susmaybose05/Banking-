public class Installment {
    private int installmentNumber;
    private double amount;
    private boolean paid;

    public Installment(int installmentNumber, double amount) {
        this.installmentNumber = installmentNumber;
        this.amount = amount;
        this.paid = false;
    }

    public void payInstallment() {
        if (!paid) {
            paid = true;
            System.out.println("Installment paid successfully.");
        } else {
            System.out.println("This installment has already been paid.");
        }
    }

    public void displayInstallment() {
        System.out.println("Installment Number: " + installmentNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + (paid ? "Paid" : "Unpaid"));
    }
}
