interface MultipleParameterPass{
    void add(int number1,int number2);
}
public class LambdaMultipleParameter
{
    public static void main(String[] args) {
        MultipleParameterPass multipleParameterPass=(number1, number2) ->
        System.out.println("addition is "+number1+number2);
        multipleParameterPass.add(77,99);
    }
}
