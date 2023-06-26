public class Default_NonParemeterized_Constructor {

    int num = 1235;

    Default_NonParemeterized_Constructor(){

        System.out.println("This is constructor");
        int a =10;
        int b =20;
        int sum = a+b;
        System.out.println("The constructor sum is "+sum);
    }


    public static void main(String[] args) {

        Default_NonParemeterized_Constructor obj = new Default_NonParemeterized_Constructor();

        System.out.println(obj.num);
    }


}
