package UnitTesting;

public class BankAccount
{
    private String firstName;
    private String lastName;
    private double balance;
    public static final int CURRENT = 1;
    public static final int SAVINGS = 2;
    private int accountType;


    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public BankAccount(String firstName, String lastName, double balance,int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType= typeOfAccount;
    }


    public double deposit(double amount,boolean branch)
    {
       return balance+=amount;
    }
    public double withdraw(double amount,boolean branch)
    {
        if(amount>500&&!branch)
        {
            throw new IllegalArgumentException();
        }
        return  balance-=amount;
    }

    public double getBalance() {
        return balance;
    }
    public boolean isCurrent()
    {
        return accountType==CURRENT;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}