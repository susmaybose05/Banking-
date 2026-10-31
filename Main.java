public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "Rahim", "01712345678");
        Customer customer2 = new Customer(102, "Karim", "01812345678");

        Saving savingAccount = new Saving(1001, 50000, customer1, 5.0);
        Current currentAccount = new Current(1002, 20000, customer2, 10000);
        FixedDeposit fixedDeposit = new FixedDeposit(1003, 100000,
                customer1, 2, 8.0);

        System.out.println("===== CUSTOMER INFORMATION =====");
        customer1.displayCustomer();

        System.out.println("\n===== SAVINGS ACCOUNT =====");
        savingAccount.displayAccount();
        savingAccount.deposit(5000);
        savingAccount.withdraw(2000);
        savingAccount.displayInterest();
        savingAccount.displayAccount();

        System.out.println("\n===== ACCOUNT TRANSFER =====");
        AccountTransfer transfer = new AccountTransfer();
        transfer.transfer(savingAccount, currentAccount, 3000);
        System.out.println("Savings balance: " + savingAccount.getBalance());
        System.out.println("Current balance: " + currentAccount.getBalance());

        System.out.println("\n===== TRANSACTION RECORD =====");
        Transaction transaction = new Transaction("Deposit", 5000);
        transaction.displayTransaction();

        System.out.println("\n===== FIXED DEPOSIT =====");
        fixedDeposit.displayAccount();
        fixedDeposit.displayMaturityAmount();

        System.out.println("\n===== CURRENT ACCOUNT =====");
        currentAccount.displayAccount();
        currentAccount.displayOverdraftLimit();

        System.out.println("\n===== LOAN INFORMATION =====");
        Loan loan = new Loan(501, 50000, 10);
        loan.displayLoan();

        System.out.println("\n===== INSTALLMENT =====");
        Installment installment = new Installment(1, 5000);
        installment.displayInstallment();
        installment.payInstallment();
        installment.displayInstallment();
    }
}
