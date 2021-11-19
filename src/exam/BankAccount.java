package exam;

public class BankAccount {
    public String name;
    public String accountNumber;
    public String accountType;
    public double balance;

    public BankAccount() {
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.initialize("Swadhin Saha", "CSE202102111", "Savings", 500.00);
        bankAccount.displayDetails();
        bankAccount.deposit(100);
        bankAccount.displayDetails();
        bankAccount.withdraw(200);
        bankAccount.displayDetails();
        bankAccount.withdraw(1000);
        bankAccount.displayDetails();
    }

    public void initialize(String name, String accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Successfully Deposited " + amount);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient Balance.");
        } else {
            this.balance -= amount;
            System.out.println("Successfully Withdrawn " + amount);
        }
    }

    public void displayDetails() {
        System.out.format("Name: %s Balance: %f \n", this.name, this.balance);
    }
}
