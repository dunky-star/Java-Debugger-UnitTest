package dunky.debugger.com;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // The branch argument is true if the customer is performing transaction
    // at a branch, with the teller.
    // It's false if the customer is performing the transaction at the ATM.
    private double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }
}