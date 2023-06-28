public class CalculatorService {
    public void Calculate(String operand){

        switch (operand){

            case "+":
                Addition addition = new Addition();
                 addition.getCalculatedValue(45,78);
                break;
            case "-":
                Subtraction subtraction= new Subtraction();
                subtraction.getCalculatedValue(43,14);
                break;

            case "*":
            Multiplication multiplication= new Multiplication();
                multiplication.getCalculatedValue(34,74);
                break;

            case "/":
                Division division=new Division();
            division.getCalculatedValue(30,3);
            break;

            case "%":
          Modulus modulus=new Modulus();
            modulus.getCalculatedValue(9,14);
            break;

        }
    }
}

