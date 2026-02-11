public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void depositingFunds(double amount)
    {
        accountBalance += amount;
        System.out.println("New balance is: " + accountBalance);
    }

    public void withdrawingFunds(double withdrawalAmount)
    {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds!");
        }
        else
        {
            accountBalance -= withdrawalAmount;
            System.out.println("Ramaining balance: " + accountBalance);
        }

    }

}
