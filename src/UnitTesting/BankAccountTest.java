package UnitTesting;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankAccountTest {

    private BankAccount bankaccount;
    private static int count =0;

    @org.junit.BeforeClass
    public static void beforeclass()
    {

        System.out.println("Runningat the beginning before all test methods"+count++);
    }

    @org.junit.Before
    public void setUp()
    {
        bankaccount = new BankAccount("Tim", "AC", 1000.00);
        System.out.println("Running before every method");
    }
    @org.junit.Test
    public void deposit() {

        double balance = bankaccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {

        double balance = bankaccount.withdraw(200.00, true);
        assertEquals(800.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_atm() {

        double balance = bankaccount.withdraw(510.00, false);
        //I am withdrawing>500 from atm, so throw exception.IT throws exception but test fails.
        //technically test should pass since its working as expectde. To mak eit pass we need to accept exception

    }

    @org.junit.Test
    public void getBalance() {

        assertEquals(1000.00, bankaccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {

        bankaccount.deposit(200.00, true);
        assertEquals(1200.00, bankaccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {

        bankaccount.withdraw(200.00, true);
        assertEquals(800.00, bankaccount.getBalance(), 0);
    }

    @org.junit.Test
    public void isCurrent_true() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CURRENT);
        assertTrue("The account is NOT a checking account",account.isCurrent());

    }

    @org.junit.After
    public void tearDown()
    {

        System.out.println("Running after every method");
    }
    @org.junit.AfterClass
    public static void afterclass()
    {

        System.out.println("Runningafter all test methods"+count++);
    }
}