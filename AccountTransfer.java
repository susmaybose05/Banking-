public class AccountTransfer {
    public void transfer(Account from, Account to, double amount) {
        if (from == to) {
            System.out.println("Cannot transfer to the same account.");
        } else if (amount <= 0) {
            System.out.println("Transfer amount must be greater than zero.");
        } else if (from.getBalance() < amount) {
            System.out.println("Transfer failed: insufficient balance.");
        } else {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Transfer successful.");
        }
    }
}
