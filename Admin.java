public class Admin extends BankAccount {
    
    public Admin(String accountHolder, double balance, String accountType, String accountNumber) {
        super(accountHolder, balance, accountType, accountNumber);
    }
    
    public void modifyCustomerBalance(BankAccount customerAccount, double newBalance) {
        customerAccount.adminSetBalance(newBalance);
        System.out.println("Admin has modified the balance of account " 
                + customerAccount.accountNumber + " to $" + newBalance);
    }
}
