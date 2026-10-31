public class FixedDeposit extends Account {
    private int durationInYears;
    private double interestRate;

    public FixedDeposit(int accountNumber, double balance, Customer customer,
                        int durationInYears, double interestRate) {
        super(accountNumber, balance, customer);
        this.durationInYears = durationInYears;
        this.interestRate = interestRate;
    }

    public double calculateMaturityAmount() {
        double interest = balance * interestRate * durationInYears / 100;
        return balance + interest;
    }

    public void displayMaturityAmount() {
        System.out.println("Duration: " + durationInYears + " years");
        System.out.println("Maturity Amount: " + calculateMaturityAmount());
    }
}
