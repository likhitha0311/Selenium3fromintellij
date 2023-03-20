package AccessModifiers;

import java.util.ArrayList;

public class Account
{
    public String AccountName;
    public int balance=0;
    public ArrayList<Integer>transactions;

    public Account(String accountName) {
        this.AccountName = accountName;
        this.transactions=new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }
public void deposit(int amount)
{
    if(amount>0)
    {
        this.balance+=amount;
        this.transactions.add(amount);
        System.out.println(amount+" deposited.New balance is "+this.balance);
    }
    else {
        System.out.println("Cannot deposit negative sum");
    }
}
    public void withdrawal(int amount)
    {
        int withdrawal=-amount;
        if(withdrawal<0)
        {
            this.balance+=withdrawal;
            this.transactions.add(withdrawal);
            System.out.println(amount+" withdrawn.New balance is "+this.balance);
        }
        else {
            System.out.println("Cannot withdraw negative sum");
        }
    }

    public void calculateBalance()
    {
        balance=0;
        for(int i:transactions)
        {
            balance+=i;
        }
        System.out.println("Calculated balance is "+balance);

    }


}
