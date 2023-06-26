public class SwitchExample {
    public void Calculate(String operand, int operand1, int operand2) {

        switch (operand) {
            case"+":
            AdditionOfTwoNumber additionOfTwoNumber=new AdditionOfTwoNumber();
            additionOfTwoNumber.getCalculateValue(operand1,operand2);
            break;
            default:
                System.out.println("this is default value");
                break;
            case "-":
                SubtractionOfTwoNumber subtraction=new SubtractionOfTwoNumber();
                subtraction.getCalculateValue(operand1,operand2);
                break;

            case "*":
                MultiplicationOfTwonumber multiplication=new MultiplicationOfTwonumber();
                multiplication.getCalculateValue(operand1,operand2);
                break;
            case"/":
                DivisionOfTwoNumber division=new DivisionOfTwoNumber();
                division.getCalculateValue(operand1,operand2);



        }
    }
}