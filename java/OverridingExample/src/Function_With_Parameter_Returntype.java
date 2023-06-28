
class Multiply{

    static int myMethod(int a , int b , float c){

        int multiply = (int) (a*b*c);

        return multiply;
    }


}


public class Function_With_Parameter_Returntype {

    public static void main(String[] args) {

        int multiply1 = Multiply.myMethod(3,4,8.2F);

        System.out.println("The multiply is "+multiply1);

//        System.out.println(Multiply.myMethod(3,4,8.2F) );
    }
}
