//example of lambda
interface LambdaEx {     //create one interface
    void calArea(int length,int breadth);   //call the methos of calarea use of this method is
}
class Main{
    public static void main(String[] args) {
        //this is the lambda syntax
        LambdaEx lambdaEx=(length,breadth)-> System.out.println("area of rectangle= " +length*breadth);
        lambdaEx.calArea(8,8);  //call the method=
    }
}
