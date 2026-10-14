public class BankAccount {

    // Variables
    private final String owner;
    private double balance;

    // Constructor
    public BankAccount (String owner, double initialBalance) {
        if(initialBalance < 0) {
            throw new IllegalArgumentException("Initial Balance cannot be zero");
        }
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Methods - Operations with account balance || Setter Methods
    public void deposit(double amount) {
        if(amount <= 0 ) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if(amount <= 0 ) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if(amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance = balance - amount;
    }

    // Getters:
    public double getBalance () {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}

