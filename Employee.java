public class Employee extends BankAccount {
    
    public Employee(String accountHolder, double balance, String accountType, String accountNumber) {
        super(accountHolder, balance, accountType, accountNumber);
    }
    
    public void changeAccountType(String newAccountType) {
        updateAccountType(newAccountType);
        System.out.println("Account type changed to: " + newAccountType);
    }
}
