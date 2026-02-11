public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdrawingFunds(100);
        bankAccount.depositingFunds(100);
        bankAccount.withdrawingFunds(50);
        bankAccount.withdrawingFunds(50);
    }
}
