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

    // Methods - Operations with account balance

}
