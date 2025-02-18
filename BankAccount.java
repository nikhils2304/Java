public class BankAccount {

    private String accountHolder;
    private double balance;
    
    
    protected String accountType;
    
    
    public String accountNumber;
    
    
    public BankAccount(String accountHolder, double balance, String accountType, String accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }
    
    public void viewBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
    }
    
    public void deposit(double amount) {
        if(amount > 0) {
            updateBalance(balance + amount);
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    protected void updateAccountType(String newAccountType) {
        this.accountType = newAccountType;
    }
    
    private void updateBalance(double newBalance) {
        this.balance = newBalance;
    }
    
    public void adminSetBalance(double newBalance) {
        updateBalance(newBalance);
        System.out.println("Balance updated to $" + newBalance);
    }
}
