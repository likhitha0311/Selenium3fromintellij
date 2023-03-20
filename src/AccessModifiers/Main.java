package AccessModifiers;

public class Main
{
    public static void main(String[] args) {
        Account timsaccount = new Account("Tim");
        timsaccount.balance=3000;
        timsaccount.deposit(700);
        timsaccount.deposit(340);
        timsaccount.withdrawal(-800);
        timsaccount.withdrawal(200);
        timsaccount.withdrawal(100);
        timsaccount.deposit(-340);
        timsaccount.transactions.add(-6700);
        timsaccount.calculateBalance();
        //the disadvantage of having public balance variable is i can set the balance from outside.So we need to make it private.

    }
}
