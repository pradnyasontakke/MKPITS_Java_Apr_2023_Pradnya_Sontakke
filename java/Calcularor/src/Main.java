public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService= new CalculatorService();
        calculatorService.Calculate("+");
        calculatorService.Calculate("-");
        calculatorService.Calculate("*");
        calculatorService.Calculate("/");
        calculatorService.Calculate("%");


    }
}