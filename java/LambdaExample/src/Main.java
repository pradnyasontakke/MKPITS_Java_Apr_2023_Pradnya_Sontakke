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
        int choice = scanner.nextInt();

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        switch (choice) {
            case 1:
                Calculation calculation = () ->
                        System.out.println("addition is " + (number1 + number2));
                calculation.Total();
                break;

//            case 2:
//                Calculation calculation1=(number1,number2) ->
//                        System.out.println("Subtraction is "+(number1-number2));
//                calculation1.Total(188,99);
//            case 3:
//                Calculation calculation2=(number1,number2) ->
//                        System.out.println("multiplication is "+(number1*number2));
//                calculation2.Total(88,99);
//            case 4:
//                Calculation calculation3=(number1,number2) ->
//                        System.out.println("division is "+(number1%number2));
//                calculation3.Total(88,9);


        }
    }

}


