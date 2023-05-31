package dunky.debugger.com;

/**
 * A unit is typically a method, therefore, Unit test will typically test a method.
 */

import static org.junit.Assert.*;

public class BankAccountTest {
     private BankAccount account;
    @org.junit.Before
    public void setup(){
        account = new BankAccount("Duncan", "Geoffrey Opiyo", 1500.0, BankAccount.SAVINGS);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(300.0, true);
        assertEquals(1300.0, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        double balance = account.withdraw(800.0, true);
        assertEquals(700, balance, 0);
    }

    @org.junit.Test
    public void getBalance() {
        account.deposit(300.0, true);
        assertEquals(1300, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isSaving_True(){
        assertTrue(account.isSaving());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test class");
    }

}