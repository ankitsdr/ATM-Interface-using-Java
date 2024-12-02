public class Transaction {
    public static void processDeposit(Account account, double amount) {
        account.deposit(amount);
    }

    public static void processWithdrawal(Account account, double amount) {
        account.withdraw(amount);
    }
}
