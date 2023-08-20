package ExceptionHandling;
public class Bank
{
    private double balance;
    public Bank(double balance)
    {
        this.balance=balance;
    }
    public void deposit(int amt) throws ExceptionTrowInvalidAmount {
        if(amt<100)
            throw new ExceptionTrowInvalidAmount();
        balance=balance+amt;
        System.out.println("Deposit amount is:"+amt);
    }
    public void withdraw(int amt) throws InsufficientBalanceException {
  if(amt<balance)
      throw  new InsufficientBalanceException();
        balance=balance-amt;
        System.out.println(" amount is:"+amt);
    }
    public double getBalance()
    {
        System.out.println("Total balance"+balance);
        return balance;
    }
}
