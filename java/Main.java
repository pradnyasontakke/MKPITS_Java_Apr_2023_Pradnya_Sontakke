import ExceptionHandling.Bank;

import java.lang.*;

import ExceptionHandling.Customer;
import ExceptionHandling.InsufficientBalanceException;
import ExceptionHandling.Transaction;
import finalkeyword1.*;

class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
////        int num=sc.nextInt();
//        FindNumberUsingMethod findNumberUsingMethod=new FindNumberUsingMethod();
//        int x=FindNumberUsingMethod.findNumber(num);

//        Circle circle=new Circle();
//        Rectangle rectangle=new Rectangle();
//        circle.calArea();
//        rectangle. RArea();
//        Calculation c;

//        CircleUsingInterface circleUsingInterface = new CircleUsingInterface();
//        RectangleUsingInterface rectangleUsingInterface = new RectangleUsingInterface();
//        circleUsingInterface.calArea();

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//       int choice=sc.nextInt();
//       switch (choice)
//        {
//            case 1:
//                c=new Addition();
//                System.out.print("Enter two number: ");
//                System.out.println(c.calculate(sc.nextInt(),sc.nextInt()));
//                System.out.print("Enter three number: ");
//                System.out.println(c.total(sc.nextInt(),sc.nextInt(),sc.nextInt()));
//                break;
//            case 2:
//                c=new Substraction();
//                System.out.println("Enter two number: ");
//                System.out.println(c.calculate(sc.nextInt(), sc.nextInt()));
//                break;
//            case 3:
//                c=new Multiplication();
//                System.out.print("Enter two number: ");
//                System.out.println(c.calculate(sc.nextInt(),sc.nextInt()));
//                break;
//            case 4:
//                c=new Division();
//                System.out.println("Enter two number: ");
//                System.out.println(c.calculate(sc.nextInt(), sc.nextInt()));
//                break;
//
//        }
//       Loan loan=new Loan("565444",444,6);
//        InterestCalculation interestCalculation=new InterestCalculation();
//     interestCalculation.CalculateInterest(loan.getAccountNumber(), loan.getAmount(), loan.getDuration());
//        Website.check("http://www.yahoo.com");

//        System.out.println( Students.sum(66,99,88));


        //exception handling
//        Bank b=new Bank(10000);
//        System.out.println("Balance: " +b.getBalance());
//        try {
//            b.deposit(90);
//        }catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("balance"+ b.getBalance());
////        try{
////            b.withdraw(6797);
////
////        }catch (InsufficientBalanceException e){
////        System.out.println(e.getBalance);

        //Exception handling
        Customer c=new Customer();
        Transaction t=new Transaction();
        t.deposit(500,c);
        c.displayDetails();

    }
}





