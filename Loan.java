public class Loan {
    private int loanId;
    private double loanAmount;
    private double interestRate;

    public Loan(int loanId, double loanAmount, double interestRate) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public double calculateTotalAmount() {
        return loanAmount + (loanAmount * interestRate / 100);
    }

    public void displayLoan() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Total Payable: " + calculateTotalAmount());
    }
}
