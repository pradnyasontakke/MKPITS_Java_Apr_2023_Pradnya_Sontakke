package ExceptionHandling;

public class Transaction
{
    public void deposit(float amount, Customer a)
    {
        a.setBalance(a.getBalance()+amount);
        System.out.println("total balance:");
    }
//    public void withdraw( double amount, Customer b)
//    {
//
//    }
//    public void transfer(Customer a, Customer b,double amount)
//    {
//
//    }
}
