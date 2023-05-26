package dunky.debugger.com;

/**
 * A unit is typically a method, therefore, Unit test will typically test a method.
 */

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Duncan", "Geoffrey Opiyo", 1000.0, BankAccount.SAVINGS);
        double balance = account.deposit(300.0, true);
        assertEquals(1300.0, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount account = new BankAccount("Duncan", "Geoffrey Opiyo", 1000.0, BankAccount.SAVINGS);
        double balance = account.withdraw(800.0, true);
        assertEquals(200, balance, 0);
    }

    @org.junit.Test
    public void getBalance() {
        BankAccount account = new BankAccount("Duncan", "Geoffrey Opiyo", 1000.0, BankAccount.SAVINGS);
        account.deposit(300.0, true);
        assertEquals(1300, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isSaving_True(){
        BankAccount account = new BankAccount("Duncan", "Geoffrey Opiyo", 1000.0, BankAccount.SAVINGS);
        assertTrue(account.isSaving());
    }

}