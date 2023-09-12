interface Substraction{
    void sub(int number1,int number2);
}
public class LamdaSubstraction {
    public static void main(String[] args) {
        Substraction substraction=(number1 ,number2)->
                System.out.println("substraction is "+(number1-number2));
        substraction.sub(566,88);
    }
}
