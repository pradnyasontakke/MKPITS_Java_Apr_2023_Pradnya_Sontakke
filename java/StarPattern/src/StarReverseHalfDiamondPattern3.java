import java.util.Scanner;

public class StarReverseHalfDiamondPattern3 {
    public void starReverseDiamond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows for pattern 3");
        int rows = scanner.nextInt();


        for (int row = 1; row <= rows-1; row++) {
            for (int space=0;space<=row;space++) {
                System.out.print(" ");
            }
            for (int column =0; column <= rows-1-row; column++) {
                System.out.print(" *");
            }

            System.out.println(" ");
        }
}}
