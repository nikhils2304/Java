public class TestBankingSystem {
    public static void main(String[] args) {
        
        System.out.println("=== Customer Account Operations ===");
        BankAccount customer = new BankAccount("John Doe", 1000.0, "Savings", "ACC123");
        customer.viewBalance(); 
        
        System.out.println();
        customer.deposit(500.0); 
        customer.viewBalance();
        
        System.out.println("\n=== Employee Operations ===");
        Employee employee = new Employee("Jane Smith", 0.0, "Employee", "EMP456");
        employee.changeAccountType("Premium Employee");
        employee.viewBalance();
        
        System.out.println("\n=== Admin Operations ===");
        Admin admin = new Admin("Super Admin", 0.0, "Admin", "ADM789");
        admin.modifyCustomerBalance(customer, 2000.0);
        customer.viewBalance();
    }
}
