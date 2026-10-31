public class Current extends Account {
    private double overdraftLimit;

    public Current(int accountNumber, double balance, Customer customer,
                   double overdraftLimit) {
        super(accountNumber, balance, customer);
        this.overdraftLimit = overdraftLimit;
    }

    public void displayOverdraftLimit() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
