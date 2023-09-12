import java.util.Scanner;

//example of lambda
 //interface LambdaEx {     //create one interface
   // void calArea(int length,int breadth);   //call the methos of calarea use of this method is
//}
class Main {
    public static void main(String[] args) {
        //this is the lambda syntax
        // LambdaEx lambdaEx=(length,breadth)-> System.out.println("area of rectangle= " +length*breadth);
        // lambdaEx.calArea(8,8);  //call the method


        //switch example
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("enter the choice");
        int choice = scanner.nextInt();




        switch (choice) {
            case 1:
                Calculation calculation = () ->
                        System.out.println("addition is " + (a+b));
                calculation.Total();
                break;

            case 2:
                Calculation calculation1=() ->
                        System.out.println("Subtraction is "+(a-b));
                calculation1.Total();
            case 3:
                Calculation calculation2=() ->
                        System.out.println("multiplication is "+(a*b));
                calculation2.Total();
            case 4:
                Calculation calculation3=() ->
                        System.out.println("division is "+(a%b));
                calculation3.Total();


        }
    }

}


