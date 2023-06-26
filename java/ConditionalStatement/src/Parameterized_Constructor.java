public class Parameterized_Constructor {

String name;

    Parameterized_Constructor(int a , int b, String name){


        int sum = a + b;
        System.out.println("The sum is "+sum);
        System.out.println("The name is"+name);

}
    public static void main(String[] args) {

        Parameterized_Constructor pc = new Parameterized_Constructor(10 ,20,"Pradnya");


        System.out.println("The Final Output");

    }
}
