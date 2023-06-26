import java.util.Scanner;

public class ExampleOfPrizeQualityTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Answer;

        do {
            System.out.println("Enter the prize:   ");
            double price = scanner.nextDouble();

            System.out.println("Enter the quality:   ");
            int quality = scanner.nextInt();

            double Total = price * quality;

           System.out.printf("The total is Rs %.2f\n ",Total);

            System.out.println("do you want to calculate another total? yes or no ");
            Answer = scanner.next();

        } while (Answer.equalsIgnoreCase("yes"));
    }
}
