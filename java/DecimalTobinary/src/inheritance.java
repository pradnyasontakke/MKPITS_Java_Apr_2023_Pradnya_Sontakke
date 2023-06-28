import java.util.List;

class Bank{
    String Employeename;

    List<Department> departments;



}
class Loan extends Bank{
    String Loantype;
    Double LoanAmount;
}
class Homeloan extends Loan{
    int roi;
}

public class inheritance {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.Employeename="bharat";

        Loan loan=new Loan();
        loan.Employeename="pradnya";

        System.out.println(bank.Employeename);
        System.out.println(loan.Employeename);

    }
}
class Department{
    String Manger;
    String Staff;
}
