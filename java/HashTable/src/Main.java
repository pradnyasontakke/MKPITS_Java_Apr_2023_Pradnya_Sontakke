//wap to create one arrays and check and move the position as user requirements
//if user enter 1 then first value move on the last and second value move on first position
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrays =new int[10];
        int values;
        for (int count=0;count<5;count++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the numbers");
            values = scanner.nextInt();

        }
        for (int result:arrays) {
            System.out.println(result);
        }
    }
}