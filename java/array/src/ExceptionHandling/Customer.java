package ExceptionHandling;
//class customer
//properties=accno,name,balance
//method=displayDetail() using setter getter

public class Customer
{
    public float getBalance;
    //data member should be private
    double accno;
    String name;
    float balance;
public Customer()
{

}
    public Customer(double accno, String name, float balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public double getAccno() {
        return accno;
    }

    public void setAccno(double accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void displayDetails()
    {
    System.out.println(accno);

        System.out.println(name);
        System.out.println(balance);
}
}
