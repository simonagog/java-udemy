public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        BankAccount newBankAccount = new BankAccount("123456789", 200.0, "Alexa", "alexa@gmail.com","0745123123");
        bankAccount.setAccountNumber("123123123123");
        bankAccount.setAccountBalance(100.0);
        bankAccount.setCustomerName("Pop Ioan");
        bankAccount.setPhoneNumber("0723123123");
        bankAccount.setEmail("popioan@gmail.com");
        bankAccount.withdrawingFunds(100);
        bankAccount.depositingFunds(100);
        bankAccount.withdrawingFunds(50);
        bankAccount.withdrawingFunds(50);
    }
}
