public class Saving extends Account {
    private double interestRate;

    public Saving(int accountNumber, double balance, Customer customer,
                  double interestRate) {
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public void displayInterest() {
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: " + calculateInterest());
    }
}
