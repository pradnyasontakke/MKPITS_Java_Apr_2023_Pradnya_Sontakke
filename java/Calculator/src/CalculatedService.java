public class CalculatedService {
    void calculate(String operand, double operator1,double operator2){
        switch (operand){
            case"+":
            AdditionOfTwoNumber addition=new AdditionOfTwoNumber();
            addition.getCalculatedValue(operator1,operator2);
            break;

            case"-":
                 SubtractionOfTwoNumber subtraction=new SubtractionOfTwoNumber();
                subtraction.getCalculatedValue(operator1,operator2);
                break;

            case"*":
                MultiplicationOfTwoNumber multiplication=new MultiplicationOfTwoNumber();
                multiplication.getCalculatedValue(operator1,operator2);
                break;

            case"/":
                DivisionOfTwoNumber division=new DivisionOfTwoNumber();
                division.getCalculatedValue(operator1,operator2);
                break;

        }


    }
}